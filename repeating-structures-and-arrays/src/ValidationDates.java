import java.util.Scanner;

public class ValidationDates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double salary;
        String sex;
        String maritalStatus;
        boolean valida = false;
        
        do {

            System.out.println("Entre the name: ");
            name = sc.next();
            System.out.println("Entre the age: ");
            age = sc.nextInt();
            System.out.println("Entre the salary: ");
            salary = sc.nextDouble();
            System.out.println("Entre the sex: ");
            sex = sc.next();
            System.out.println("Entre the marital Status: ");
            maritalStatus = sc.next();

            if((name.length() >= 3) &&
             (age >= 0 && age <=100) &&
              salary >= 0 && 
              sex.contains("f")  || sex.contains("m") &&
              maritalStatus.equals("s")  || maritalStatus.equals( "c")  || maritalStatus.equals("v")  || maritalStatus.equals("d")
              ){
                System.out.println("successfully validated");
                valida = true;
            }
            System.out.println("There is an error! Try again.");

        } while (!valida);

    }
}
