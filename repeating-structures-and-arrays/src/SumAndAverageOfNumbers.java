import java.util.Scanner;

public class SumAndAverageOfNumbers {
    
    public static void main(String[] args) {
        
        Scanner scaner =  new Scanner(System.in);

        int number;
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter the number: ");
            number = scaner.nextInt();
            sum = sum + number;
            average = sum / 5; 
            System.out.println(sum);
        }

        System.out.println("The Sum is " + sum + " and Average is " + average);
    }
}
