import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println( "Type you Note: ");
        int note = scanner.nextInt();
        
        while(note < 0 || note > 10){
            
            System.out.println( "Note Invalid! Type it again: ");
            note = scanner.nextInt();
        }

        System.out.println("Finishing! This is note: "+ note);



    }
}
