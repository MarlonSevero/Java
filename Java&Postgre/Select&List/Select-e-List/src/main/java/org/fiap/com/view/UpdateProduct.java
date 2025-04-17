package org.fiap.com.view;

import org.fiap.com.dao.ProductDao;
import org.fiap.com.exception.EntityNotFound;
import org.fiap.com.model.Product;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UpdateProduct {
        public static void main(String[] args){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            try{
                ProductDao dao = new ProductDao();
                Product product = dao.pesquisar(1);
                product.setNome("NOME-ATUALIZADO");
                product.setDt_nascimento(LocalDate.parse("01/01/2001", formatter));
                dao.update(product);
                System.out.println("Produto atualizado!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (EntityNotFound e){
                System.out.println("Item nao localizado!");
            }
        }
}
