package br.com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

public class Read_Files {
    public static void main(String[] args){

        File arquivo = new File("src/br/com/files/index.html"); //metadados do arquivo

        try(FileReader fr = new FileReader(arquivo); //le caracter por caracter
            BufferedReader br = new BufferedReader(fr)){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
               }
            }catch (FileNotFoundException e){
            System.err.println("Arquivo nao encontrado");
        } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }


//
//    import java.io.*;
//public class LeituraArquivo {
//    public static void main(String[] args) {
//        File file = new File("alunos.txt");
//        try (FileReader fr = new FileReader(file);
//             BufferedReader br = new BufferedReader(fr)) {
//            String linha;
//            while ((linha = br.readLine()) != null) {
//                System.out.println(linha);
//            }
//        }catch (FileNotFoundException e){
//            System.err.println("Arquivo não encontrado");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}