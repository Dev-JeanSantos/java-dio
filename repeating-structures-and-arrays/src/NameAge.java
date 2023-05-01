import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) throws Exception {
        
        while(true){
            
            Scanner scanner = new Scanner(System.in);

            System.out.println("Type your name: ");
            String  name = scanner.next();
            if(name.equals("0"))break;

            System.out.println("Type your age: ");
            int age = scanner.nextInt();

            System.out.println("The Name  is: " + name + " Age: " + age + " Years");
        }
        
        System.out.println("Finalized");
    }
}
