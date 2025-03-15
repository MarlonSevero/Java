package br.com.game.model;

public class Personagem {
    private String name;
    private int energy;
    private String superPower;
    private SpecialSkill specialSkill;

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

    public String getName(){
        return name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getEnergy() {
        return energy;
    }

    public SpecialSkill getSpecialSkill() {
        return specialSkill;
    }

    public Personagem setEnergy(int energy) {
        this.energy = energy;
        return this;
    }

    public Personagem setName(String name) {
        this.name = name;
        return this;
    }

    public Personagem setSpecialSkill(SpecialSkill specialSkill) {
        this.specialSkill = specialSkill;
        return this;

    }

    public Personagem setSuperPower(String superPower) {
        this.superPower = superPower;
        return this;
    }

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
        if (!specialSkill.getStatus_skill()){
            System.out.println("Habilidade Especial Inativa");
        }else if (energy >= specialSkill.getEnergy_cust() ) {
            System.out.println("Ativando habilidade " + specialSkill.getName_skill());
            energy -= specialSkill.getEnergy_cust();
        }else{
            System.out.println("Voce nao tem energia o suficiente!");
        }
    }
}


