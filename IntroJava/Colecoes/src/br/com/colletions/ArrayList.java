package br.com.colletions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args){

        //lista de filmes
        List<String> filmes = Arrays.asList("O poderoso Chefao", "Meu Malvado Favorito", "Senhor dos aneis", "Harry Poter");

        //lista de votacoes
        java.util.ArrayList<Integer> votos = new java.util.ArrayList<>(Arrays.asList(0, 0, 0, 0));
        Scanner sc = new Scanner(System.in);

        //exibindo filmes
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println((i + 1) + "." + filmes.get(i));
        }

        //votacao
        System.out.println("Digite o numero do seu filme favorito! (0 para sair da votacao)");
        int voto;
        do{
            voto = sc.nextInt();
            if(voto > 0 && voto <= filmes.size()){
                int indice = voto - 1;
                votos.set(indice, votos.get(indice) + 1);
            }else if(voto != 0){
                System.out.println("Opcao Invalida!");
            }
        }while (voto != 0);

        //contando os votos e setando o vencedor

        int maxVotos = 0;
        int indiceVence = -1;

        for (int i = 0; i < votos.size(); i++) {
            if(votos.get(i) > maxVotos){
                maxVotos = votos.get(i);
                indiceVence = i;
            }
        }

        //falando quem ganhou
        if(indiceVence != -1){
            System.out.println("O filme ganhador é o " + filmes.get(indiceVence) + " com o total de " + maxVotos + " votos");
        }else{
            System.out.println("Nenhum voto foi feito!");
        }
    }
}
