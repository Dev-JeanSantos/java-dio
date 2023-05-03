import java.util.Scanner;

public class ValidateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validation = false;
        String name;
        String password;

        do {

            System.out.println("Entre the usename");
            name = sc.next();
            System.out.println("Entre the password");
            password = sc.next();

            if(name.equalsIgnoreCase(password)){
                System.out.println("The password must not be the same as the name, try again!");
            }else{
                validation = true;
                System.out.println("Name: " + name + " Password: " + password);
            }

        } while (!validation);

    }
}
