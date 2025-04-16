package br.com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Remove_Files {
    public static void main(String[] args){
        try{
            Files.delete(Path.of("/Users/marlonsevero/Desktop/Java/Colecoes/src/br/com/files/teste.java"));
            System.out.println("Arquivo removido com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
