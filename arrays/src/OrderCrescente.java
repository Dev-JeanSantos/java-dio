import java.util.Arrays;

public class OrderCrescente {

    public static void main(String[] args) {

        int[] vetor = { -5, -6, 15, 50, 8, 4 };
        int count = 0;

        while(count < vetor.length){
            System.out.print(vetor[count] + " | ");
            count++;
        }

        Arrays.sort(vetor);
        for (int number : vetor) {
            System.out.println(number);

        }
    }
}
