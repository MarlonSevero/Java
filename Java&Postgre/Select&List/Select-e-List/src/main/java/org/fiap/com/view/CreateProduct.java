package org.fiap.com.view;

import org.fiap.com.dao.ProductDAO;
import org.fiap.com.model.Product;

import java.time.LocalDate;

public class CreateProduct {
    public static void main (String[] args){
        try {
            ProductDAO dao = new ProductDAO();
            Product produtoCadastro = new Product();
            produtoCadastro.setNome("Bolacha Traquinas");
            produtoCadastro.setDt_nascimento(LocalDate.of(1990, 5, 15)); // ano, mês, dia
            dao.create(produtoCadastro);
            dao.fecharConexao();
            System.out.println("Produto Cadastrado");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

