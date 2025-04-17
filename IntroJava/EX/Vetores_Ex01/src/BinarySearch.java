public class BinarySearch {
    public static void main(String[] args) {
        //A busca binaria funciona para vetores ordenados.
        int[] vetorOrdenado = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int elementoProcurado = 60;
        int start = 0;
        int end = vetorOrdenado.length - 1;
        int posicaoEncontrada = -1; //assume-se inicialmente que o elemento nao existe no vetor

        while(start <= end){
            int meio = start + (end - start)/2;
            if(vetorOrdenado[meio] == elementoProcurado){
                posicaoEncontrada = meio; //elemento encontrado
                break;
            }else if(vetorOrdenado[meio] < elementoProcurado){
                start = meio + 1; //continua a busca na parte superior
            }
            else{
                end = meio - 1; //continua a busca na parte inferior
            }
        }
        if(posicaoEncontrada != -1){
            System.out.println("Elemento encontrado no indice:" + posicaoEncontrada);
        }else{
            System.out.println("Elemento nao encontrado no vetor!");
            }
        }
    }