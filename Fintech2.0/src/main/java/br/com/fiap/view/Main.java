package br.com.fiap.view;

import br.com.fiap.dao.AccountDao;
import br.com.fiap.exception.EntityNotFound;
import br.com.fiap.service.CryptoService;
import br.com.fiap.service.MenuHandler;
import br.com.fiap.service.UserService;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, EntityNotFound {

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        AccountDao accountdao = new AccountDao();
        CryptoService cryptoService = new CryptoService();

        MenuHandler menuHandler = new MenuHandler(scanner, userService, accountdao, cryptoService);
        menuHandler.exibirMenuPrincipal();
    }
}