import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int multiplicationTable = scn.nextInt();
        
        System.out.println("Tabuada de " + multiplicationTable);

        for (int i = 1 ; i <= 10; i++){
            int result = multiplicationTable * i;
            System.out.println(multiplicationTable + " X "  + i + " = " + result);
        }
    }
}
