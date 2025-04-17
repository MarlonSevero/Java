package br.com.files;

import java.io.*;
import java.util.Scanner;

public class Example_ReadWrite {
    public static void main(String[] args){
        AdiocionarItem();
        ExibirItens();
    }

    public static void AdiocionarItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um item para adicionar à lista de compras (ou digite 'sair' para finalizar):");
        String item = sc.nextLine();

        while(!item.equalsIgnoreCase("sair")){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("listaCompra.txt", true))){
                bw.write(item);
                bw.newLine();
                System.out.println("Item " + item + " adicionado com sucesso!");

            } catch (FileNotFoundException e) {
                System.err.println("Arquivo nao encontrado");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Digite um item para adicionar à lista de compras (ou digite 'sair' para finalizar):");
            item = sc.nextLine();
        }
    }

    public static void ExibirItens(){
        System.out.println("LISTA DE COMPRAS");
        try(BufferedReader br = new BufferedReader(new FileReader("listaCompra.txt"))){
            String itemLido;
            while ((itemLido = br.readLine()) != null){
                System.out.println("- " + itemLido);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
