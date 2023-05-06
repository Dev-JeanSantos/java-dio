import java.util.Arrays;

public class ReverseOrder {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        // System.out.println(vetor.length);
        
        int count = 0;
        
        // while(count <= vetor.length -1){
        //     System.out.println(vetor[count]);
        //     count++;
        // }

        while(count < vetor.length){
            System.out.print(vetor[count] + " | ");
            count++;
        }
        
        System.out.println();
        
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " | ");   
        }
         
        System.out.println();
        
    }
}
