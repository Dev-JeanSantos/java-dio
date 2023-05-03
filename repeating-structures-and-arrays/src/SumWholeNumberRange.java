import java.util.Scanner;
public class SumWholeNumberRange {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.println("Enter the number one: ");
        int numberOne = scaner.nextInt();

        System.out.println("Enter the number two: ");
        int numberTwo = scaner.nextInt();

        if (numberOne < numberTwo){
            for (int i = numberOne+1; i < numberTwo; i++) {
                sum = sum + i;
                System.out.print((i + ","));
            }
        }else if(numberOne > numberTwo){
            for (int i = numberOne -1; i > numberTwo; i--){
                sum = sum + i;
                System.out.print((i + ","));
            }
        }
        System.out.println();
        System.out.print("Sum of intervals: " + sum);
    }
    
}
