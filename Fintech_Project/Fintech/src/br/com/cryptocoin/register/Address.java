package br.com.cryptocoin.register;

import com.sun.source.tree.UsesTree;

public class Address {

    private String rua;
    private String bairro;
    private String numero;
    private String complemento;
    private String cidade;

    public Address(String cidade, String rua, String bairro, String numero, String complemento){
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCidade() {return cidade;}

    public String getBairro() {
        return bairro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getRua() {
        return rua;
    }

    public Address setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public Address setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Address setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public Address setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public Address setRua(String rua) {
        this.rua = rua;
        return this;
    }
}
