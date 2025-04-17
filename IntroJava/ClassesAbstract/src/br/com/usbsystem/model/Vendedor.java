package br.com.usbsystem.model;

public class Vendedor extends Funcionario{

    private double vendasSemestrais;

    public Vendedor(String name, String cpf, Address address, double salarioFixo, double vendasSemestrais) {
        super(name, cpf, address, salarioFixo);
        this.vendasSemestrais = vendasSemestrais;
    }

    public Vendedor() {
        super();
    }


    public double getVendasSemestrais() {
        return vendasSemestrais;
    }

    public Vendedor setVendasSemestrais(double vendasSemestrais) {
        this.vendasSemestrais = vendasSemestrais;
        return this;
    }

    @Override
    public double getBonus() {
        return getVendasSemestrais() * 0.015 ;
    }

    @Override
    public String getDetalhe() {
        return "Nome: " + this.getName()+ "\n" +
                "Endereco: " + this.getAddress().getEnderecoCompleto()+ "\n" +
                "Salario mensal: R$" + this.getSalarioFixo()+ "\n" +
                "Vendas no semestre: R$" + this.getVendasSemestrais()+ "\n" +
                "Bônus semestral: " + this.getBonus();
    }
}
