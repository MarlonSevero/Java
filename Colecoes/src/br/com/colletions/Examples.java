package br.com.colletions;

import java.util.*;
import java.util.ArrayList;

public class Examples {
    public static void main (String[] args){
        List<String> lista = new ArrayList<>();
        Set<Integer> setNumeros = new HashSet<>();
        Map<Integer, String> numeros = new HashMap<>();


        lista.add("Ola");


        setNumeros.add(100);
        setNumeros.add(200);
        setNumeros.add(300);

        numeros.put(100, "cem");
        numeros.put(200, "duzentos");
        numeros.put(300, "trezentos");

        for (int numero: setNumeros){
            System.out.println(numero);
        }

        for(Map.Entry<Integer, String> numero: numeros.entrySet()){
            System.out.println("A chave é "+ numero.getKey() + " em  inteiro e o valor " + numero.getValue() + " em String");
        }
    }
}
