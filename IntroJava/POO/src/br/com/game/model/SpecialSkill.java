package br.com.game.model;

public class SpecialSkill {

    private String name_skill;
    private int energy_cust;
    private boolean status_skill;

    public SpecialSkill(String name_skill, int energy_cust, boolean status_skill){
        this.name_skill = name_skill;
        this.energy_cust = energy_cust;
        this.status_skill = status_skill;
    }

    public boolean getStatus_skill(){
        return status_skill;
    }

    public int getEnergy_cust() {
        return energy_cust;
    }

    public String getName_skill() {
        return name_skill;
    }

    public SpecialSkill setEnergy_cust(int energy_cust) {
        this.energy_cust = energy_cust;
        return this;
    }

    public SpecialSkill setName_skill(String name_skill) {
        this.name_skill = name_skill;
        return this;
    }

    public SpecialSkill setStatus_skill(boolean status_skill) {
        this.status_skill = status_skill;
        return this;
    }
}
