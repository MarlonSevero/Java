package br.com.usbsystem.model;

public class Gerente extends Funcionario{

    private int numSala;
    private int ramal;
    private double faturaSemestre;

    public Gerente(String name, String cpf, Address address, double salarioFixo,
                   int numSala, int ramal, double faturaSemestre) {
        super(name, cpf, address, salarioFixo);
        this.numSala = numSala;
        this.ramal = ramal;
        this.faturaSemestre = faturaSemestre;
    }

    public int getNumSala() {
        return numSala;
    }

    public int getRamal() {
        return ramal;
    }

    public double getFaturaSemestre() {
        return faturaSemestre;
    }

    public Gerente setFaturaSemestre(double faturaSemestre) {
        this.faturaSemestre = faturaSemestre;
        return this;
    }

    public Gerente setNumSala(int numSala) {
        this.numSala = numSala;
        return this;
    }

    public Gerente setRamal(int ramal) {
        this.ramal = ramal;
        return this;
    }

    @Override
    public double getBonus() {
        return this.getFaturaSemestre() * 0.05;
    }

    @Override
    public String getDetalhe() {
        return "Nome:" + this.getName() + " " +
                "Sala:" + this.getNumSala() + " " +
                "Endereco:" + getAddress() + " " +
                "Salario mensal: $" + getSalarioFixo() + " " +
                "Faturamento Semestral: R$" + this.getFaturaSemestre() + " " +
                "Bonus Semstral:" + this.getBonus();
     }
}
