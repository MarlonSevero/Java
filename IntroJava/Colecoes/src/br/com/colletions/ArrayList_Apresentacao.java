package br.com.colletions;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Apresentacao {
    public static void main(String[] args) {

        List<String> cores = new ArrayList<>();

        //adicionando elementos
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Green");
        cores.add("Yellow");
        System.out.println(cores);

        //acessando elementos
        System.out.println(cores.get(1));

        //modificando elementos
        System.out.println(cores.set(0, "Azul Celeste"));
        System.out.println(cores);

        //Remocao de elementos
        System.out.println(cores.remove(1));
        System.out.println(cores.remove("Green"));
        System.out.println(cores);

        //tamanho da lista
        System.out.println(cores.size());

        //verificando se um elemento esta presente
        if (cores.contains("Azul Celeste")){
            System.out.println("A cor azul celeste esta na lista de cores!");
        }

        //percorrendo a lista
        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }

        //limpando a lista
        cores.clear();
        System.out.println(cores);

        //Validando se lista esta vazia
        if(cores.isEmpty()){
            System.out.println("A lista esta vazia");
        }

        for (String cor : cores){
            System.out.println(cor);
        }
    }
}