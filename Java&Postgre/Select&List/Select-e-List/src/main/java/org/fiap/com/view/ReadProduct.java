package org.fiap.com.view;

import org.fiap.com.dao.ProductDao;
import org.fiap.com.model.Product;

import java.util.List;

public class ReadProduct {
    public static void main(String[] args){

        try{
            ProductDao dao = new ProductDao();
            List<Product> products = dao.read();
            for(Product product : products){
                System.out.println("ID:" + product.getId() + " NOME:" + product.getNome());
                System.out.println("Data Nascimento: " + product.getDt_nascimento() + "\nData Cadastro:" + product.getDt_cadastro());
                System.out.println("----------------");
            }
            dao.fecharConexao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
