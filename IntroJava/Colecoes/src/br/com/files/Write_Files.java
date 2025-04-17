package br.com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Write_Files {
    public static void main(String[] args){

        List<String> lista = Arrays.asList("Joao Pereira", "Marcos Severo", "Lucas Almeida", "Maria Joaaquina");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("names.txt", true))){
            for (String linha : lista){
                bw.write(linha);
                System.out.println(linha);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}