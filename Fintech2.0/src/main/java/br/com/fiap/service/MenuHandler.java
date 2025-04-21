package br.com.fiap.service;

import br.com.fiap.dao.AccountDao;
import br.com.fiap.exception.EntityNotFound;
import br.com.fiap.model.user.Account;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MenuHandler{

        private final Scanner scanner;
        private final UserService userService;
        private final CryptoService cryptoService;
        private final AccountDao accountdao;

        public MenuHandler(Scanner scanner, UserService userService, AccountDao accountdao, CryptoService cryptoService){
            this.scanner = scanner;
            this.userService = userService;
            this.accountdao = accountdao;
            this.cryptoService = cryptoService;
        }

        public void exibirMenuPrincipal () throws SQLException, EntityNotFound {
        int control;
        System.out.println("Bem-vindo ao sistema My Digital Assets Home");

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Exibir principais crypto moedas");
            System.out.println("3 - Login");
            System.out.println("4 - Depósito");
            System.out.println("5 - Saque");
            System.out.println("6 - Carteira");
            System.out.println("7 - Outros ativos");
            System.out.println("8 - Mostrar todos usuarios"); //getAll
            System.out.println("0 - Sair");
            System.out.println("-----------------------------------------------------");

            control = scanner.nextInt();
            scanner.nextLine(); // consumir linha
            switch (control) {
                case 1:
                    userService.registerUser(scanner);
                    break;
                case 2:
                    showValues();
                    break;
                case 3:
                    loginUser();
                    break;
                case 4: System.out.println("Depósito simulado.");
                        break;
                case 5: System.out.println("Saque simulado.");
                        break;
                case 6: System.out.println("Carteira.");
                        break;
                case 7: System.out.println("Outros Ativos.");
                        break;
                case 8:
                    readUsers(scanner, accountdao);
                    break;
                case 0: System.out.println("Obrigado por usar o My Digital Assets Home!");
                default:
                    System.out.println("Opção inválida.");
                        break;
            }
        } while (control != 0);
    }

        private void showValues () {

            int opcaoMoeda = 1;
            do{
                System.out.println("1 - BITCOIN");
                System.out.println("2 - SOLANA");
                System.out.println("3 - USDT");
                System.out.println("4 - DOGE");
                System.out.println("0- SAIR");
                opcaoMoeda = scanner.nextInt();
                cryptoService.showValues(opcaoMoeda);
            }while (opcaoMoeda != 0);
    }

        private void loginUser () throws SQLException, EntityNotFound {
        try {
            AccountDao accountDao = new AccountDao();
            LoginService service = new LoginService(accountDao);
            System.out.println("Informe seu email:");
            String email = scanner.nextLine();
            System.out.println("Informe sua senha:");
            String password = scanner.nextLine();
            boolean autenticado = service.auth(email, password);
            if (autenticado) {
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Email ou senha inválidos.");
            }
        } catch (EntityNotFound e) {
            throw new EntityNotFound("Erro ao realizar login!");
        }
    }

    private void readUsers(Scanner scanner, AccountDao accountdao) throws SQLException, EntityNotFound{
        try{
            List<Account> accounts = accountdao.getAllUsers();
            for(Account account: accounts){
                System.out.println("NOME: " + account.getName() + " | EMAIL DE ACESSO: " + account.getEmail() + "");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}