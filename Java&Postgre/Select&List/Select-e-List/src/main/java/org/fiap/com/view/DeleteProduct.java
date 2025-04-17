package org.fiap.com.view;

import org.fiap.com.dao.ProductDao;
import org.fiap.com.exception.EntityNotFound;

import java.sql.SQLException;

public class DeleteProduct {
    public static void main(String[] args){
        try{
            ProductDao dao = new ProductDao();
            dao.delete(2);
            dao.fecharConexao();
            System.out.println("Produto Removido!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }catch (EntityNotFound e){
            System.err.println("Item nao localizado!");
        }
   }
}
