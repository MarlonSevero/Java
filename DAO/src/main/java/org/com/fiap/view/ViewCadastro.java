package org.com.fiap.view;

import org.com.fiap.dao.ProductDao;
import org.com.fiap.model.Product;

import java.time.LocalDate;

public class ViewCadastro {
    public static void main (String[] args){
        try {
            ProductDao dao = new ProductDao();
            Product produtoCadastro = new Product();
            produtoCadastro.setNome("MARLON SALLES SEVERO");
            produtoCadastro.setDt_nascimento(LocalDate.of(1990, 5, 15)); // ano, mês, dia
            dao.cadastrar(produtoCadastro);
            dao.fecharConexao();
            System.out.println("Produto Cadastrado");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
