package br.com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy_Files {
    public static void main(String[] args){

        Path origem = Paths.get("/Users/marlonsevero/Desktop/Java/Colecoes/src/br/com/files/List_Files.java");
        Path destino = Paths.get("Copy_file.txt");

        try{
            Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("arquivo copiado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
