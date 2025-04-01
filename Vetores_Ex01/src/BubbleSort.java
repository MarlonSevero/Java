public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 50, 20, 10};

        boolean houveTroca;

        do{
            houveTroca = false;
            for (int i = 1; i < vetor.length; i++) {
                if(vetor[i - 1] > vetor[i]){
                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    houveTroca = true;
                }
            }
        }while (houveTroca);
        System.out.println("Vetor Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}