package br.com.usbsystem.model;

public abstract class Funcionario {

    private String name;
    private String cpf;
    private Address address;
    private double salarioFixo;

    public Funcionario(){

    }

    public Funcionario(String name, String cpf, Address address, double salarioFixo){
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.salarioFixo = salarioFixo;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getCpf() {
        return cpf;
    }

    public Funcionario setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Funcionario setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Funcionario setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Funcionario setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
        return this;
    }

    public abstract double getBonus();
    public abstract String getDetalhe();
}
