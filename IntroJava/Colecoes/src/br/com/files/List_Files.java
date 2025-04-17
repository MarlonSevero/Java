package br.com.files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;

public class List_Files {
    public static void main(String[] args){
        Path directory = Paths.get("/Users/marlonsevero/Desktop/Java/Colecoes/src/br/com/colletions");

        try(DirectoryStream<Path> stremPath = Files.newDirectoryStream(directory)){
            for(Path arquivo : stremPath){
                System.out.println(arquivo.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }
    }
}
