package br.com.usbsystem.model;

public class Dev extends Funcionario{

    private int ramal;

    public Dev(){

    }

    public Dev(String name, String cpf, Address address, double salarioFixo, int ramal) {
        super(name, cpf, address, salarioFixo);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public Dev setRamal(int ramal) {
        this.ramal = ramal;
        return this;
    }

    @Override
    public double getBonus() {
        return this.getSalarioFixo() * 0.002;
    }

    @Override
    public String getDetalhe() {
        return "Nome: " + this.getName()+ "\n" +
                "Ramal:" + this.getRamal()+ "\n" +
                "Endereco: " + this.getAddress().getEnderecoCompleto()+ "\n" +
                "Salario mensal: R$" + this.getSalarioFixo()+ "\n" +
                "Bônus semestral: " + this.getBonus();
    }
}
