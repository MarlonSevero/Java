package org.fiap.com.view;

import org.fiap.com.dao.ProductDAO;
import org.fiap.com.exception.EntityNotFound;
import org.fiap.com.model.Product;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuView {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDAO dao;
        System.out.println("Welcome");
        try {
            dao = new ProductDAO();
            int con;
            do {
                System.out.println("Escolha uma opcao:?\n" +
                        "1 - Register\n" +
                        "2 - Search ID\n" +
                        "3 - List\n" +
                        "4- Update\n" +
                        "5 - Remove\n");
                con = sc.nextInt();
                switch (con) {
                    case 1:
                        Register(sc, dao);
                        break;
                    case 2:
                        Search(sc, dao);
                        break;
                    case 3:
                        Read(sc, dao);
                        break;
                    case 4:
                        Update(sc, dao);
                        break;
                    case 5:
                        Delete(sc, dao);
                        break;
                    case 0:
                        Update(sc, dao);
                        System.out.println("Saindo....");
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                        break;
                }
            } while (con != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void Register(Scanner scanner, ProductDAO productDAO) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Enter the product`s name:");
            String name = scanner.next() + scanner.nextLine();
            System.out.println("Enter the manufactuting date (dd/mm/yyyy):");
            String dataStr = scanner.nextLine();
            LocalDate date = LocalDate.parse(dataStr, formatter);
            Product newProduct = new Product(name, date);
            productDAO.create(newProduct);
        } catch (SQLException e) {
            System.err.println("Err create");
        } catch (java.time.format.DateTimeParseException e) {
            System.err.println("Data Format err");
        } catch (Exception e) {
            System.err.println("Err ");
        }
    }

    private static void Search(Scanner scanner, ProductDAO productDAO){
        System.out.println("Digite o codigo buscado:");
        long cod = scanner.nextInt();
        try{
            Product product = productDAO.pesquisar(cod);
            System.out.println("Nome:" + product.getNome() + "\nData Cadastro:" + product.getDt_nascimento() + " Data Banco:" + product.getDt_cadastro());
        } catch (SQLException e) {
            System.err.println("Err ao localizar");
        } catch (EntityNotFound e) {
            System.err.println("Item nao encontrado");
        }
    }

    private static void Read(Scanner sc, ProductDAO productDAO) throws SQLException{
        try{
            List<Product> products = productDAO.read();
            for(Product product : products){
                System.out.println("ID:" + product.getId() + "\nNome:" + product.getNome() + "\nData Cadastro:" + product.getDt_nascimento() + "\nData Banco:" + product.getDt_cadastro() + "\n--------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void Update(Scanner scanner, ProductDAO productDAO){
        System.out.println("Digite do item a atualizar:");
        long cod = scanner.nextInt();
        try{
            Product product = productDAO.pesquisar(cod);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Enter the product`s name:");
            String name = scanner.next() + scanner.nextLine();
            System.out.println("Enter the manufactuting date (dd/mm/yyyy):");
            String dataStr = scanner.nextLine();
            LocalDate date = LocalDate.parse(dataStr, formatter);
            product.setNome(name);
            product.setDt_nascimento(date);
            productDAO.update(product);
            System.out.println("Produto atualizado!");
        } catch (SQLException e) {
            System.err.println("Item nao localizado");
        } catch (EntityNotFound e) {
            throw new RuntimeException(e);
        }
    }

    private static void Delete(Scanner scanner, ProductDAO productDAO){
        System.out.println("Digite do item a deletar:");
        long cod = scanner.nextInt();
        try{
            productDAO.delete(cod);
            System.out.println("Item deletado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (EntityNotFound e) {
            throw new RuntimeException(e);
        }
    }

}