package br.com.cryptocoin.register;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class UserInfo {

    private String name;
    private LocalDate dt_birth;
    private double renda;
    private String cpf;
    Address address;

    public UserInfo(){}

    public UserInfo(String name, LocalDate dt_birth, double renda, String cpf, Address address){
        this.name = name;
        this.dt_birth = dt_birth;
        this.renda = renda;
        this.cpf = cpf;
        this.address = address;
    }

    public String getDt_Formatted(){ /*metodo para formatar a data nascimento padrao brasil*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dt_birth.format(formatter);
    }

    public void setDt_birth(LocalDate dt_birth){ /*setter para setar a data de nascimento*/
        this.dt_birth = dt_birth;
    }

    public String getName() {
        return name;
    }

    public UserInfo setName(String name) {
        this.name = name;
        return this;
    }

    public double getRenda() {
        return renda;
    }

    public UserInfo setRenda(double renda) {
        this.renda = renda;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public UserInfo setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public UserInfo setAddress(Address address) {
        this.address = address;
        return this;
    }

}
