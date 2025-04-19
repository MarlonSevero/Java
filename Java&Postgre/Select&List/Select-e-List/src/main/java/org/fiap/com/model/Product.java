package org.fiap.com.model;
import java.time.LocalDate;

public class Product {

    private int id;
    private String nome;
    private LocalDate dt_nascimento;
    private LocalDate dt_cadastro;

    public Product(int id, String nome, LocalDate dt_nascimento){
        this.id = id;
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
    }

    public Product(int id, String nome, LocalDate dt_nascimento, LocalDate dt_cadastro){
        this.id = id;
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.dt_cadastro = dt_cadastro;
    }

    public Product(){

    }

    public Product(String name, LocalDate date) {
        this.nome = name;
        this.dt_nascimento = date;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDt_cadastro() {
        return dt_cadastro;
    }

    public LocalDate getDt_nascimento() {
        return dt_nascimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDt_nascimento(LocalDate dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public void setDt_cadastro(LocalDate dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }
}
