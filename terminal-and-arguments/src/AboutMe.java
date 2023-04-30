import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Type your firstName: ");
        String firstName = scanner.next();
        
        System.out.println("Type your lastName: ");
        String lastName = scanner.next();
        
        System.out.println("Type your height: ");
        double height = scanner.nextDouble();
     
        System.out.println("Type your age: ");
        int age = scanner.nextInt();

        //os argumentos começam com indice 0
        // String nome = args [0];
        // String sobrenome = args [1];
        // int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        // double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + firstName + " " + lastName);
        System.out.println("Tenho " + age + " anos ");
        System.out.println("Minha altura é " + height + "cm ");
    }
    
}
