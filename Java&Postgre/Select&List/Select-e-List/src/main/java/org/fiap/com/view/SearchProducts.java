package org.fiap.com.view;

import org.fiap.com.dao.ProductDAO;
import org.fiap.com.exception.EntityNotFound;
import org.fiap.com.model.Product;

import java.sql.SQLException;

public class SearchProducts {
    public static void main(String[] args){
        try{
            ProductDAO dao = new ProductDAO();
            Product product = dao.pesquisar(1);
            System.out.println("ID:" + product.getId() + " NOME:" + product.getNome());
            System.out.println("Data Nascimento: " + product.getDt_nascimento() + "\nData Cadastro:" + product.getDt_cadastro());
            dao.fecharConexao();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (EntityNotFound e){
            System.err.println("Codigo Nao encontrado!");
        }
    }
}
