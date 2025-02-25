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
}


