import java.util.Scanner;
public class OddNumbers {
    public static void main(String[] args) {

        boolean number;

        for (int i = 0; i < 50 ; i++) {

            number = i % 2 != 0;
            if(number){
                System.out.print(i + ",");
            }
        }
    }
}
