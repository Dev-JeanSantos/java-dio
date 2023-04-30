package edu.jean.secdoundWeek;
public class MyVariable {
    public static void main(String[] args) {

        //Declarações de variaveis
        String meuNome = "Jean";
        int anoFabricacao = 2022;
        boolean verdadeira = false;
        anoFabricacao = 2023;

        
        String firstName = "Jean";
        String lastName = "Santos";
        String fullName = fullName(firstName, lastName);
       
        System.out.println("The full name: " + fullName);
    }

    
        //Criando Metodos
        public static String fullName( String firstName, String lastName) {
            return firstName.concat(" ").concat(lastName);
        }
    
}
