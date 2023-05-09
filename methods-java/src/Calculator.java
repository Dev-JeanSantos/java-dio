import java.util.Random;

public class Calculator {
    public static void main(String[] args) throws Exception {

        Random rdm = new Random();
        
        int number1 = rdm.nextInt(100);
        int number2 = rdm.nextInt(100);

        System.out.println("number 1 = " + number1 + " number 2 = "+ number2);

        
        sum(number1, number2);
        subtraction(number1, number2);
        multiplication(number1, number2);
        division(number1, number2);

    }

    public static int sum(int number1,int  number2){
        int sum = number1 + number2;
        System.out.println("The Sum result: "+ sum);
        return  sum;
    }
   
    public static int subtraction(int number1,int  number2){
        int subtraction = number1 - number2;
        System.out.println("The Subtraction result: "+ subtraction);
        return  subtraction;
    }
    
    public static int multiplication(int number1,int  number2){
        int multiplication = number1 * number2;
        System.out.println("The Multiplication result: "+ multiplication);
        return  multiplication;
    }
    
    public static double division(int number1,int  number2){
        double division = number1 / number2;
        System.out.println("The Division result: "+ division);
        return  division;
    }
    
}
