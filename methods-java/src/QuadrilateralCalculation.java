import java.util.Random;

public class QuadrilateralCalculation {
    public static void main(String[] args) {
        
        Random rdm = new Random();

        int b = rdm.nextInt(20);
        int h = rdm.nextInt(20);
        int B = rdm.nextInt(10,20);
        int l = rdm.nextInt(20);
        
        calculator(l);
        calculator(b, h);
        calculator(B, b, h);
    }
    
    public static void calculator(int lado){
        
        int a;
        a = lado * lado;

        System.out.println("A area do quadrado de lado: "+ lado + " é: "+a);
    }

    
    public static void calculator(int base, int altura){
        
        int a;
        a = base * altura;

        System.out.println("A area do retangulo de base: "+ base + " é altura: " +altura+ " é de: "+a);
    }

    public static void calculator(int baseMenor, int baseMaior, int altura){
        
        int a;

        a = ((baseMaior + baseMenor) * altura)/ 2;

        System.out.println("A area do retangulo de base maior: "+ baseMaior + " base menor: "+ baseMenor + " e altura: " +altura+ " é de: "+a);
    }
}
