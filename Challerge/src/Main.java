
import br.com.model.City;
import br.com.model.Address;
import br.com.model.Student;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
                Scanner sc = new Scanner(System.in);
                int op;
                Student student = new Student();

                do {
                    System.out.println("Escolha: " +
                            "1-Cadastrar aluno " +
                            "2-Exibir aluno " +
                            "0-Sair aluno ");
                            op = sc.nextInt();

                    switch (op){
                        case 1:
                            System.out.println("Qual o nome do Student?");
                            String nome = sc.next() + sc.nextLine();
                            System.out.println("Qual o RM?");
                            int rm = sc.nextInt();
                            System.out.println("Qual o logradouro do Student?");
                            String logradouro = sc.next() + sc.nextLine();
                            System.out.println("Qual o número?");
                            String numero = sc.next() + sc.nextLine();
                            System.out.println("Qual o CEP?");
                            String cep = sc.next() + sc.nextLine();
                            System.out.println("Qual o nome da City?");
                            String nomeCity = sc.next() + sc.nextLine();
                            System.out.println("Qual o estado?");
                            String estado = sc.next() + sc.nextLine();
                            City city = new City(nomeCity, estado);
                            Address address = new Address(logradouro, numero, cep, city);
                            student.setName(nome);
                            student.setMatricula(rm);
                            student.setAddress_name(address);
                            System.out.println("Student registrado!");
                            break;
                        case 2:
                            System.out.println(student.getName() + ", rm: " + student.getMatricula());
                            System.out.println(student.getAddress_name().getLogradouro() + ", " + student.getAddress_name().getNumber() + ", CEP: " + student.getAddress_name().getCep());
                            System.out.println(student.getAddress_name().getCidade().getName() + "/" + student.getAddress_name().getCidade().getEstado());
                            break;
                        case 0:
                            System.out.println("Finalizando o sistema");
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                }while (op != 0);
                sc.close();
            }
        }