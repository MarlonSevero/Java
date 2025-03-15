package br.com.game.view;

import br.com.game.model.Personagem;
import br.com.game.model.SpecialSkill;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        Personagem personagem_temp = new Personagem();
        do{
            System.out.println("-----------------------------------------------------");
            System.out.println("Escolha uma opcao:");
            System.out.println("1-Cadastrar personagem\n2-Exibir personagens\n3-Attack\n4-Aumentar Energia\n5-Ativar Habilidade \n0-Sair\n");
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
                    personagem_temp.setName(temp_name).setEnergy(temp_energy).setSuperPower(temp_power);

                    personagem_temp.setSpecialSkill(new SpecialSkill(name_skill, energy_cust, status_skill));
                    break;
                case 2:
                    if (personagem_temp.getName() == null){
                        System.out.println("Voce ainda nao cadastrou ninguem");
                        break;
                    }else{
                        System.out.println(personagem_temp.getName() + " tem o super poder de " + personagem_temp.getSuperPower() + " e energia de " + personagem_temp.getEnergy() + " ");
                        System.out.println("Habilidade: " + personagem_temp.getSpecialSkill().getName_skill()+ " com custo de energia de " + personagem_temp.getSpecialSkill().getEnergy_cust() + " e a habilidade esta " + personagem_temp.getSpecialSkill().getStatus_skill());

                        break;
                    }
                case 3:
                    System.out.println("Digite o nome do ataque:");
                    String attack = scanner.next() + scanner.nextLine();
                    personagem_temp.attack(attack);
                    break;
                case 4:
                    if(personagem_temp.getName() != null){
                        System.out.println("Digite a quantidade de energia:");
                        int energyplus = scanner.nextInt();
                        personagem_temp.energyPlus(energyplus);
                        System.out.println(personagem_temp.getName() + " tem um nivel agora de" + personagem_temp.getEnergy());
                        break;
                    }else{
                        System.out.println("Voce ainda nao cadastrou nenhum personagem!4");
                        break;
                    }
                case 5:
                    personagem_temp.startSkill();
                    break;

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
