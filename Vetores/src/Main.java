import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//
//        System.out.println("Hello, World!");
//        int[] vetor = new int[10]; //inicializando o vetor e dizendo que é do tipo Inteiro
//        int[] vetor2 = {10, 20, 30, 40, 50};
//
//        for (int j : vetor) {
//            System.out.println(j);
//        }
//
//        for(int i = 0; i < vetor2.length; i++){
//            System.out.println(vetor2[i]);
//        }
//
//        vetor2[0] = 100;
//        System.out.println("Novo valor = " + vetor2[0]);
//
//        int[] vetor3 = new int[5];
//        for(int i = 0; i < vetor3.length; i++){
//            System.out.println("Digite o valor da posicao [" + i + "] do vetor:");
//            vetor3[i] = sc.nextInt();
//        }
//        for (int i = 0; i < vetor3.length; i++) {
//            System.out.println("valor da posicao [" + i + "] = "+ vetor3[i]);
//        }

        //ENTRADA DE DADOS
        String[] produtosEstoque = new String[5];
        for (int i = 0; i < produtosEstoque.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + " :");
            produtosEstoque[i] = sc.next() + sc.nextLine();
        }

        System.out.println("Digite o nome do item procurado:");
        String itemProcurado = sc.next() + sc.nextLine();

        int control = 0;
        boolean itemEncontrado = false;

        while(!itemEncontrado && control < produtosEstoque.length){
            if(produtosEstoque[control].equals(itemProcurado)){
                itemEncontrado = true;
            }
            control++;
        }
        if(itemEncontrado){
            System.out.println(itemProcurado + " FOI LOCALIZADO");
        }else{
            System.out.println(itemProcurado + " NAO FOI LOCALIZADO");
        }


    }
}