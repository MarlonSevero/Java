import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        Personagem personagem_temp = new Personagem();
        do{
            System.out.println("-----------------------------------------------------");
            System.out.println("Escolha uma opcao:");
            System.out.println("1-Cadastrar personagem\n2-Exibir personagens\n0-Sair\n");
            System.out.println("-----------------------------------------------------");
            op = scanner.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite o nome do personagem:");
                    String temp_name = scanner.next() + scanner.nextLine();
                    System.out.println("Digite o poder especial do personagem:");
                    String temp_power = scanner.next() + scanner.nextLine();
                    System.out.println("Digite o valor da energia do personagem:");
                    int temp_energy = scanner.nextInt();

                    System.out.println("Digite o nome da habilidade especial:");
                    String name_skill = scanner.next() + scanner.nextLine();
                    System.out.println("Digite o custo de energia da habilidade especial:");
                    int energy_cust = scanner.nextInt();
                    System.out.println("Digite se a habilidade esta habilitada true/false:");
                    boolean status_skill = scanner.nextBoolean();
                    personagem_temp.name = temp_name;
                    personagem_temp.energy = temp_energy;
                    personagem_temp.superPower = temp_power;
                    personagem_temp.specialSkill = new SpecialSkill(name_skill, energy_cust, status_skill);


                    break;
                case 2:
                    if (personagem_temp.name == null){
                        System.out.println("Voce ainda nao cadastrou ninguem");
                        break;
                    }else{
                        System.out.println(personagem_temp.name + " tem o super poder de " + personagem_temp.superPower + " e energia de " + personagem_temp.energy + " ");
                        System.out.println("Habilidade: " + personagem_temp.specialSkill.name_skill+ " com custo de energia de " + personagem_temp.specialSkill.energy_cust + " e a habilidade esta " + personagem_temp.specialSkill.status_skill);

                        break;
                    }
                case 0:
                    System.out.println("Voce descidiu sair do sistema!");
                    break;
                default:
                    System.out.println("Opcao Invalida! Tente novamente.");
            }
        }while(op != 0);
        scanner.close();
    }
}
