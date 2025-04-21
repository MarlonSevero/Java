package br.com.cryptocoin.view;

import br.com.cryptocoin.model.coins.CoinBitcoin;
import br.com.cryptocoin.model.coins.CoinDog;
import br.com.cryptocoin.model.coins.CoinSolana;
import br.com.cryptocoin.model.coins.CoinUsdt;
import br.com.cryptocoin.model.user.Account;
import br.com.cryptocoin.model.user.Address;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int control;
        LocalDate dt_birth = null;
        CoinBitcoin coinBitcoin = new CoinBitcoin();
        CoinSolana coinSolana = new CoinSolana();
        CoinUsdt coinUsdt = new CoinUsdt();
        CoinDog coinDog = new CoinDog();

        System.out.println("Bem-Vindo ao sistema My Digital Assents Home");
        System.out.println("Aqui voce tem tudo sobre o mundo CRYPTO na palma da sua mao!");
        System.out.println("Ao executar varias vezes o programa a API de busca de valores pode dar erro ao retornar os valores pois esses sao volateis...\npor gentileza aguarde alguns instantes e execute novamente (Em manutencao do cache)" + "");
        try{
            do {
                System.out.println("-----------------------------------------------------");
                System.out.println("Escolha uma opcao:");
                System.out.println("1-Cadastrar\n2-Exibir principais moedas\n3-Login\n4-Deposito\n5-Saque \n0-Sair\n");
                System.out.println("-----------------------------------------------------");
                control = scanner.nextInt();
                switch (control){
                    case 1:
                        System.out.println("Infome seu nome completo:");
                        String temp_name = scanner.next() + scanner.nextLine();
                        while(dt_birth == null){
                            try{
                                System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
                                String dt_birthString = scanner.nextLine();
                                dt_birth = LocalDate.parse(dt_birthString, formatter);
                            }catch (Exception e){
                                System.out.println("Data Invalida\nDigite Novamente!");
                            }
                        }
                        System.out.println("Informe sua renda mensal:");
                        double temp_renda = scanner.nextDouble();
                        System.out.print("Informe o nome da rua,o Bairro, o numero, o complemento e a Cidade...\n" +
                                "Teclando enter ao final de cada um : ");
                        Address temp_address = new Address(scanner.nextLine(), scanner.nextLine(),
                                scanner.nextLine(), scanner.nextLine(), scanner.next() + scanner.nextLine());
                        System.out.println("Informe seu CPF:");
                        String temp_cpf = scanner.nextLine();


                        new_user.setName(temp_name);
                        new_user.setDt_birth(dt_birth);
                        new_user.setRenda(temp_renda).setCpf(temp_cpf).setAddress(temp_address);
                        System.out.println("Dados Basicos preenchidos com sucesso!");
                        Thread.sleep(1000);

                        System.out.println("Informe seu email:");
                        String temp_email = scanner.next() + scanner.nextLine();
                        System.out.println("Informe sua senha:");
                        String temp_password = scanner.next() + scanner.nextLine();
                        login.setEmail(temp_email).setPassword(temp_password);
                        System.out.println(login.toString());
                        Thread.sleep(1000);
                        break;
                    case 2:
                        if(coinBitcoin.getCoinPriceBitcoinUsd() != -1){
                            System.out.println("Voce quer ver o valor em 1 - USD ou 2 - BRL?");
                            int i = scanner.nextInt();
                            if(i == 1){
                                System.out.println(coinBitcoin.bitcoinDataUsd());
                                System.out.println(coinSolana.solanaDataUsd());
                                System.out.println(coinUsdt.usdtDataUsd());
                                System.out.println(coinDog.dogDataUsd());
                                break;
                            } else if (i == 2) {
                                System.out.println(coinBitcoin.bitcoinDataBrl());
                                System.out.println(coinSolana.solanaDataBrl());
                                System.out.println(coinUsdt.usdtDataBrl());
                                System.out.println(coinDog.dogDataBrl());
                                break;
                            }else{
                                System.out.println("Opcao Invalida!");
                                break;
                            }
                        }else{
                            System.out.println("Erro ao obter valor!");
                            break;
                        }
                    case 3:
                        if(new_user.getName() != null){
                            System.out.println("Infome o seu email:");
                            String emai_login = scanner.next() + scanner.nextLine();
                            System.out.println("Informe a sua senha:");
                            String emai_pass = scanner.next() + scanner.nextLine();
                            if(emai_login.equals(login.getEmail()) && emai_pass.equals(login.getPassword())){
                                System.out.println("Usuario logado!");
                            }else{
                                System.out.println("Dados Invalidos!");
                            }
                            break;
                        }else{
                            System.out.println("Sem registro no sistema!");
                            break;
                        }
                    case 4:
                        System.out.println("//Simula deposito");
                        break;
                    case 5:
                        System.out.println("//Simula saque");
                        break;
                    case 0:
                        System.out.println("Obrigado por usar a `My Digital Assents Home`");
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                }
            } while (control != 0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

//REFATORACAO DEIXANDO O CODIGO MAIS MODULAR (SUGESTAO DO CHATGPT)
//✅ Main → Apenas inicialização e chamada de menus
//✅ MenuHandler → Lida com a interação do usuário
//✅ UserService → Gerencia usuários (cadastro e login)
//✅ CryptoService → Obtém preços de criptomoedas