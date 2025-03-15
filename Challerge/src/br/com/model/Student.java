package br.com.model;

import java.sql.Struct;

public class Student {
    private int matricula;
    private String name;
    private Address address_name;

    public Student(){

    }

    public Student(int matricula, String name, Address address_name){
        this.name = name;
        this.matricula = matricula;
        this.address_name = address_name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress_name() {
        return address_name;
    }

    public int getMatricula(){
        return matricula;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAddress_name(Address address_name) {
        this.address_name = address_name;
        return this;
    }

    public Student setMatricula(int matricula) {
        this.matricula = matricula;
        return this;
    }
}
