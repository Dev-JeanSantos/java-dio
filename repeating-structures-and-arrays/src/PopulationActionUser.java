import java.util.Scanner;

public class PopulationActionUser {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Population country A ? ");
        double popCountryA = scanner.nextDouble();
        System.out.println("Population country B' ? ");
        double popCountryB = scanner.nextDouble();
        System.out.println("Growth rate population country A' ? ");
        double growthRateA = scanner.nextDouble();
        System.out.println("Growth rate population country B' ? ");
        double growthRateB = scanner.nextDouble();
        
        int year = 1;   

 
        for (int i = 1; popCountryB >= popCountryA; i++) {



            popCountryA = ((popCountryA * growthRateA)/100)+popCountryA;
            popCountryB = ((popCountryB * growthRateB)/100)+popCountryB;

            year = i++;

            System.out.println("Year: " + year);
            System.out.printf("Population A: %.1f %n" , popCountryA);
            System.out.printf("Population B: %.1f %n ", popCountryB);    
        }
        
        System.out.println ("A populaçao do país A supera a população do pais B em " +year+ " Anos");
    }
}
