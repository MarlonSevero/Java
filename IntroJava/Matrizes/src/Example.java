public class Example {
    public static void main(String[] args) {

        int[][] matriz = new int[3][2]; //matriz de 3 linhas e 2 colunas
        int[][] matriz2 = {{1, 2}, {3, 4}, {5, 6}};
        matriz[1][1] = 10;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}