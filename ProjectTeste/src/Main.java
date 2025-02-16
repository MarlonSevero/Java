import java.util.Scanner; /*utilizado para usar recebermos dados do usuario*/

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        /*VARIAVEIS E TIPO DE DADOS*/
        /*Tipo de Dados Primitivos
        *byte, short, int, long
        *float, double
        *char
        * boolean
        *
        * Tipo de Referecia (referencia de memoria)
        * ex. String
        * */

        int idade = 17;
        String nome = "Marlon";
        char carteira = 'B'; /*aspas simples no char*/
        double altura = 1.70;
        /*---------------------------------------------------------------------*/
        /*ENTRADA DE DADOS*/
        Scanner resposta = new Scanner(System.in); /*estaciando o metodo*/
        System.out.println("Digite seu nome:");
        String name = resposta.nextLine(); /*captura string*/
        System.out.println("Digite sua idade:");
        int age = resposta.nextInt();   /*captura Int*/
        /*---------------------------------------------------------------------*/
        /*EXEMPLO*/

        System.out.println("NOTA 1:");
        float nota1 = resposta.nextFloat();
        System.out.println("NOTA 2:");
        float nota2 = resposta.nextFloat();
        float media = (nota1 + nota2)/2;
        System.out.println("Media = " + media);

    }
}