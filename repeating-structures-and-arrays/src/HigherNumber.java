import java.util.Scanner;

public class HigherNumber {
    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);
        
        int number;
        int largestInteger = 0;

        for (int i = 0; i < 5; i++) {
            
            System.out.println("Insert number Integer: ");
            number = scanner.nextInt();

            if (number > largestInteger){
                largestInteger = number;
            }else{
                System.out.println("The largest number is: "+ largestInteger);
            }            
        }
    }
}
