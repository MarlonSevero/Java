import java.util.Scanner; /*utilizado para usar recebermos dados do usuario*/
import java.util.Random;
public class Main {
    public static void main(String[] args) {



        Backup


/*
System.out.println("Hello, World!");

/*---------------------------------------------------------------------*/
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

        /*OPERADORES LOGICOS E RELACIONAIS*/

        /*IF E ELSE

        System.out.println("Digite sua idade");
        Scanner resp = new Scanner(System.in);
        int agee = resp.nextInt();
        if(agee > 18){
            System.out.println("Voce tem permissao para dirigir!");
        }else if (agee == 18){
            System.out.println("Ja fez sua carteira ?!");
        }else{
            System.out.println("Voce ainda é menor de idade!");
        }

        */

        /*LACOS DE REPETICAO*/

        /*
        /*WHILE
        int numero = 1;
        while(numero != 0){
            System.out.println("Isso é um LOOP, digite um numero!");
            System.out.println("Voce quer continuar?\n0 - NAO\nOUTRO NUMERO - SIM");
            Scanner respostaPergunta = new Scanner(System.in);
            numero = respostaPergunta.nextInt();
            respostaPergunta.close();
        }
        System.out.println("ATE MAIS!");
        */

        /*LOOP FOR

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        */

        /*EXEMPLO 001*/
        /*exemplo loop for*/
/*
        double mediaNotas = 0;
        Scanner respostas = new Scanner(System.in);
        double totalNotas = 0;
        int qtdAlunos = 0;
        double nota = 0;

        System.out.println("Vamos realizar a media dos alunos, digite a quantidade de alunos:");
        qtdAlunos = respostas.nextInt();

        for(int i = 0; i < qtdAlunos; i++){
            System.out.println("Digite a nota do " + (i + 1) +  " aluno:");
            nota = respostas.nextDouble();
            totalNotas += nota;
        }
        mediaNotas = totalNotas/qtdAlunos;
        System.out.println("A media dos alunos deu:" + mediaNotas);
        */




        /*EXEMPLO 002*/
        /*
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1;
        int tentativas = 0;
        boolean advinha = false;

        System.out.println("Welcome");
        System.out.println("Guess number 1 - 10");

        while (!advinha){
            System.out.println("Digite um numero de 1 - 10:");
            int tentativa_number = scanner.nextInt();
            tentativas++;
            if(tentativa_number == secretNumber){
                System.out.println("Acertou um numero em " + tentativas + " tentativas");
                break;
            }else if(tentativa_number < secretNumber){
                System.out.println("Tente um numero maior!");
            }else{
                System.out.println("Tente um numero menor!");
            }
        }

        scanner.close();
        */
    }
}