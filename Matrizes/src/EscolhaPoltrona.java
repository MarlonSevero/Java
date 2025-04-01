import java.util.Scanner;

public class EscolhaPoltrona {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Matriz representando os assentos do cinema (0 = livre 1 = ocupado)
        int[][] salaCiname = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 0}
        };

        //Exibe assentos atual
        System.out.println("Situacao dos assentos (L = LIVRE, O = OCUPADO)");
        for (int i = 0; i < salaCiname.length; i++) {
            for (int j = 0; j < salaCiname[i].length; j++) {
                System.out.print(salaCiname[i][j] == 0 ? "L " : "O ");
            }
            System.out.println("<<- Fila" + (i + 1));
        }

        //recebe escolha
        System.out.println("Escolha a fila:");
        int filaEscolhida = sc.nextInt() - 1; //ajusta para o indice do vetor
        System.out.println("Escolha o numero do assento:");
        int assentoEscolhido = sc.nextInt() - 1;

        //valida se posicao é valida e reserva

        if(filaEscolhida >= 0 && filaEscolhida < salaCiname.length &&
            assentoEscolhido >= 0 && assentoEscolhido < salaCiname[filaEscolhida].length){
            if(salaCiname[filaEscolhida][assentoEscolhido] == 0){
                salaCiname[filaEscolhida][assentoEscolhido] = 1;
                System.out.println("Assento Reservado com sucesso!");
            }else{
                System.out.println("O assento ja esta ocupado");
            }
        }else{
            System.out.println("Posicao Invalida!");
        }
        sc.close();
    }
}
