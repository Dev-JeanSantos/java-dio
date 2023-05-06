import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String[] consonants = new String[6];
        int qtdConsoants = 0;

        int count = 0;

        do {
            System.out.println("Enter is letter: ");
            String let = scn.next();

            if (!(let.equalsIgnoreCase("a") |
                    let.equalsIgnoreCase("e") |
                    let.equalsIgnoreCase("i") |
                    let.equalsIgnoreCase("o") |
                    let.equalsIgnoreCase("u"))) {

                consonants[count] = let;
                qtdConsoants++;
            }

            count++;
            
        } while (count < consonants.length);
        System.out.println("Consoantes: ");
        for (String consoant : consonants) {
            if (consoant != null) {
                System.out.print(consoant + " ");
            }
        }
        System.out.println("");
        System.out.println("Total of Consoants: "+qtdConsoants);
        System.out.println("Vector Size: "+ consonants.length);
    }
}
