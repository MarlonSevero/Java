package br.com.cryptocoin.register;

import java.time.LocalDate;

public class Register extends UserInfo {

    UserInfo userInfo;

    public Register(){}

    public Register(String name, LocalDate dt_birth, double renda, String cpf, Address address) {
        super(name, dt_birth, renda, cpf, address);
    }

}
