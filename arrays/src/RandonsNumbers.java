import java.util.Arrays;
import java.util.Random;

public class RandonsNumbers {

    public static void main(String[] args) {
        
        Random random = new Random();

        int[] randonsNumbers = new int[10];

        for(int i = 0; i < randonsNumbers.length; i++){

           int number = random.nextInt(100);
           randonsNumbers[i] = number;

        }

        System.out.println("Random Numbers: ");
        for (int number : randonsNumbers) {
            System.out.print((number) + " ");
        }

        System.out.println("");
        Arrays.sort(randonsNumbers);
        System.out.println("Increasing Random Numbers: ");
        for (int number : randonsNumbers) {
            System.out.print((number) + " ");
        }

        System.out.println("");
        System.out.println("Sucessors Random Numbers: ");
        for (int number : randonsNumbers) {
            System.out.print((number+1) + " ");
        }
      
        System.out.println("");
        System.out.println("Antcessors Random Numbers: ");
        for (int number : randonsNumbers) {
            System.out.print((number-1) + " ");
        }
        
        System.out.println("");
        System.out.println("Random Numbers Even: ");
        for (int number : randonsNumbers) {
            if(number % 2 == 0){
                System.out.print( number + " ");                
            }
        }
        
        System.out.println("");
        System.out.println("Random Numbers Odd: ");
        for (int number : randonsNumbers) {
            if(number % 2 != 0){
                System.out.print( number + " ");                
            }
        }
    }
}