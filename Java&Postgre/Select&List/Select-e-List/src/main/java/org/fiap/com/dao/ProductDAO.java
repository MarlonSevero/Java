package org.fiap.com.dao;

import org.fiap.com.exception.EntityNotFound;
import org.fiap.com.factory.ConnectionFactory;
import org.fiap.com.model.Product;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private Connection conexao;

    public ProductDAO() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void create(Product product) throws SQLException{

        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO produtos (nome, dt_nascimento) VALUES (?, ?);");S

        stm.setString(1, product.getNome());
        stm.setDate(2, java.sql.Date.valueOf(product.getDt_nascimento()));
        stm.executeUpdate();
    }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }

    private Product parseProduto(ResultSet result) throws SQLException{
        int id = result.getInt("id");
        String nome = result.getString("nome");
        LocalDate data_nascimento = result.getDate("dt_nascimento").toLocalDate();
        LocalDate data_cadastro = result.getDate("dt_cadastro").toLocalDate();
        return new Product(id, nome, data_nascimento, data_cadastro);
    }

    public Product pesquisar(long codigo) throws SQLException, EntityNotFound{
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM produtos WHERE id = ?");
        stm.setLong(1, codigo); //passa no parametro `?` o valor informado em `codigo`
        ResultSet result = stm.executeQuery(); //informacoes encontradas no banco de dados
        if(!result.next())throw new EntityNotFound("Produto nao encontrado"); //posiciona o cursor no proximo elemento encontrado
            return parseProduto(result);
    }

    public List<Product> read() throws SQLException{
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM produtos");
        ResultSet result = stm.executeQuery(); //informacoes encontradas no banco de dados
        List<Product> lista =  new ArrayList<>();
        while (result.next()){
            lista.add(parseProduto(result));
         }
        return lista;
    }

    public void update(Product product) throws SQLException{
        PreparedStatement stm = conexao.prepareStatement("UPDATE produtos SET nome = ?, dt_nascimento = ? WHERE id = ?");
        stm.setString(1, product.getNome());
        stm.setDate(2, java.sql.Date.valueOf(product.getDt_nascimento()));
        stm.setLong(3, product.getId());
        stm.executeUpdate();
    }

    public void delete(long codigo) throws SQLException, EntityNotFound{
        PreparedStatement stm = conexao.prepareStatement("DELETE from produtos WHERE id = ?");
        stm.setLong(1, codigo);
        int linha = stm.executeUpdate();
        if(linha == 0)
            throw new EntityNotFound("Item nao lozalizado para remocao!");
    }
}
