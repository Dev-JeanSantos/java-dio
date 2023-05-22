import java.util.Random;

public class QuadrilateralCalculation {
    public static void main(String[] args) {
        
        Random rdm = new Random();

        int b = rdm.nextInt(20);
        int h = rdm.nextInt(20);
        int B = rdm.nextInt(10,20);
        int l = rdm.nextInt(20);


        calculator(b, h);
        calculator(B, b, h);
        System.out.println("A area do quadrado de lado: "+ l + " é: "+calculator(l));
        System.out.println("A area do retangulo de base: "+ b + " é altura: " + h + " é de: "+calculator(b, h));
        System.out.println("A area do retangulo de base maior: "+ B + " base menor: "+ b + " e altura: " +h+ " é de: "+calculator(b, B, h));
    }
    
    public static int calculator(int lado){
        
        int a;
        a = lado * lado;
        return a;
    }

    
    public static int calculator(int base, int altura){
        
        int a;
        a = base * altura;
        return a;

    }

    public static int calculator(int baseMenor, int baseMaior, int altura){
    
        int a;
        a = ((baseMaior + baseMenor) * altura)/ 2;
        return a;
    }
}
