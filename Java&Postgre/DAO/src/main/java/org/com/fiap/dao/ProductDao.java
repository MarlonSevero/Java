package org.com.fiap.dao;
import org.com.fiap.factory.ConnectionFactory;
import org.com.fiap.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao {

    private Connection conexao;

    public ProductDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrar(Product product) throws SQLException{

        PreparedStatement stm = conexao.prepareStatement(
                "INSERT INTO produtos (nome, dt_nascimento) VALUES (?, ?);");

        stm.setString(1, product.getNome());
        stm.setDate(2, java.sql.Date.valueOf(product.getDt_nascimento()));
        stm.executeUpdate();
       }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }




}
