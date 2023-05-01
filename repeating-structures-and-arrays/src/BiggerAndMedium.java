import java.util.Scanner;

public class BiggerAndMedium {
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);

        int number;
        int big = 0;
        int sum = 0;
        int count = 0;

        do {
            System.out.println("Type your number: ");
            number = sca.nextInt();

            if(number > big) big = number;
            sum = (number + sum);
            count = count +1;

        } while (count < 5);

        System.out.println("The bigger number is "+ big + ", sum total of numbers is "+ (sum) +" and average of numbers is "+ (sum/count));


    }
}
