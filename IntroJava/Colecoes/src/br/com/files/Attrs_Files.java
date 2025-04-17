package br.com.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Attrs_Files {
    public static void main(String[] args){

        Path arquivo = Paths.get("/Users/marlonsevero/Desktop/Java/Colecoes/src/br/com/files/Copy_Files.java");

        try{
            BasicFileAttributes attr = Files.readAttributes(arquivo, BasicFileAttributes.class);
            System.out.println("Tamanho: "+ attr.size());
            System.out.println("Data Criacao: "+ attr.creationTime());
            System.out.println("Ultima modificao: " + attr.lastModifiedTime());
            System.out.println("É um diretorio? " + attr.isDirectory());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
