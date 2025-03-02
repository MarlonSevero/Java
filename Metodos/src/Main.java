public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Candy brigadeiro= new Candy("Brigadeiro");

        brigadeiro.say();
        int soma = calc.sum(10, 10);
        System.out.println(soma);
    }
}