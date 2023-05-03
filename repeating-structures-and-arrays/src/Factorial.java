import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to calculate the factorial: ");
        int number = sc.nextInt();
        int factorialResult = 1;

        for (int i = number; i >= 1; i--) {
            factorialResult = factorialResult * i;
        }
        System.out.println("factorial de "+ number + " : " + factorialResult);
    }
    
}
