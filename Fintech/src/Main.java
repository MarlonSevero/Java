import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int control;
        String temp_name;
        double temp_renda;
        LocalDate dt_birth = null;
        String usd = "usd"; //coinConvertUsd
        String bitcoin = "bitcoin";
        String solana = "solana";
        String usdt = "tether";
        double coinPriceBitcoin = CryptoPriceFetcher.getCryptoPrice(bitcoin, usd);
        double coinPriceSolana = CryptoPriceFetcher.getCryptoPrice(solana, usd);
        double coinPriceUsdt = CryptoPriceFetcher.getCryptoPrice(usdt, usd);

        System.out.println("Bem-Vindo ao sistema My Digital Assents Home");
        System.out.println("Aqui voce tem tudo sobre o mundo CRYPTO na palma da sua mao!");
        try{
            do {
                System.out.println("-----------------------------------------------------");
                System.out.println("Escolha uma opcao:");
                System.out.println("1-Cadastrar\n2-Exibir principais moedas\n3-Minha Carteira\n4-Deposito\n5-Saque \n0-Sair\n");
                System.out.println("-----------------------------------------------------");
                control = scanner.nextInt();
                switch (control){
                    case 1:
                        System.out.println("Infome seu nome completo:");
                        temp_name = scanner.next() + scanner.nextLine();
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
                        temp_renda = scanner.nextDouble();
                        Thread.sleep(1000);
                        UserInfoRegister userInfoRegister = new UserInfoRegister(temp_name, dt_birth, temp_renda);
                        Thread.sleep(1000);
                        System.out.println("Parabens *" + userInfoRegister.name + "* agora voce tem conta a sua conta criada!\n-----------------------------------------------------");
                        System.out.println("Dados:\nNome: " + userInfoRegister.name + "\nData Nascimento: " + userInfoRegister.getDt_Formatted() + "\nRenda Mensal:" + userInfoRegister.renda);
                        break;
                    case 2:
                        if(coinPriceBitcoin != -1){
                            System.out.println("PRECO do " + bitcoin + " em " + usd.toUpperCase() + ":" + coinPriceBitcoin);
                            System.out.println("PRECO do " + solana + " em " + usd.toUpperCase() + ":" + coinPriceSolana);
                            System.out.println("PRECO do " + usdt + " em " + usd.toUpperCase() + ":" + coinPriceUsdt);

                            break;
                        }else{
                            System.out.println("Erro ao obter valor!");
                            break;
                        }
                    case 3:
                        System.out.println("//exibe valores da carteira (Validar se pode pegar de alguma corretora)");
                        break;
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