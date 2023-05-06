import java.util.Random;

public class MultidimensionalArray {
    public static void main(String[] args) {
        
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(2);
            }
        }

        System.out.println("Matriz: ");

        for (int[] line : matriz) {
            for (int column : line) {
                System.out.print(column + " ");
            }
            System.out.println("");
        }
    }
}
