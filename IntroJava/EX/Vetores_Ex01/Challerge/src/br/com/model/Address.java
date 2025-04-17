package br.com.model;

import javax.crypto.Cipher;
import java.sql.Struct;

public class Address {

    //logradouro, número, CEP e uma referência à cidade,

    private String logradouro;
    private String number;
    private String cep;
    private City cidade;



    public Address(String logradouro, String number, String cep, City cidade){
        this.logradouro = logradouro;
        this.number = number;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumber() {
        return number;
    }

    public String getCep() {
        return cep;
    }

    public City getCidade() {
        return cidade;
    }

    public Address setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public Address setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public Address setNumber(String number) {
        this.number = number;
        return this;
    }

    public Address setCidade(City cidade) {
        this.cidade = cidade;
        return this;
    }
}