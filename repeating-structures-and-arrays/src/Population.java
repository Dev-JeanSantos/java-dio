public class Population {
    public static void main(String[] args) {
        
        double popCountryA = 80000;
        double popCountryB = 200000;
        double growthRateA = 3.0;
        double growthRateB = 1.5;
        
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
