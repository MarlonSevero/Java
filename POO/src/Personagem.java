public class Personagem {
    String name;
    int energy;
    String superPower;
    SpecialSkill specialSkill;

    public Personagem(String name, int energy, String superPower){ /*Contrutores*/
        this.name = name;
        this.energy = energy;
        this.superPower = superPower;
    }

    public Personagem(String name){
        this.name = name;
    }

    public Personagem(){

    };

    public void attack(String attack){
        if (energy >=10){
            System.out.println(name + " realizou um ataque");
            energy-= 10;
        }else{
            System.out.println(name + " esta com a energia insuficiente");
        }
    }

    public int energyPlus(int value){
            energy += value;
            return value;
    }

    public void startSkill(){
        if (!specialSkill.status_skill){
            System.out.println("Habilidade Especial Inativa");
        }else if (energy >= specialSkill.energy_cust ) {
            System.out.println("Ativando habilidade " + specialSkill.name_skill);
            energy -= specialSkill.energy_cust;
        }else{
            System.out.println("Voce nao tem energia o suficiente!");
        }
    }
}


