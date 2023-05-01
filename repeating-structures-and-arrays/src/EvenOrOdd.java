import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);

        int quantityNumber;
        int number;
        int quantityEven = 0;
        int quantityOdd = 0;
        System.out.println("Type quantity numbers: ");
        quantityNumber = sca.nextInt();
        
        int count = 0;
        
        do {
            
            System.out.println("Type is Number ");
            number  = sca.nextInt();
            if(number % 2 == 0) quantityEven++;
            else quantityOdd++;
            
            count ++;

        } while (count < quantityNumber);

        System.out.println("Quantity numbers even = " + quantityEven);
        System.out.println("Quantity numbers odd =  " +  quantityEven);


    }
}
