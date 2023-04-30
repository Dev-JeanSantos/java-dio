public class App {
    public static void main(String[] args) throws Exception {

        // Concatenação
        String fullName = "Language " + "JAVA";
        System.out.println(fullName);

        String concatenation = "?";
        System.out.println(concatenation);
        
        concatenation = 1 + 1 + 1 + "1";
        System.out.println(concatenation);
        
        concatenation = 1 + "1" + 1 + 1;
        System.out.println(concatenation);
        
        concatenation = 1 + "1" + 1 + "1";
        System.out.println(concatenation);
        
        concatenation = "1" + 1 + 1 + 1;
        System.out.println(concatenation);
        
        concatenation = "1" + (1 + 1 + 1);
        System.out.println(concatenation);

        //Valores Unários
        int number = 10;
        System.out.println(number);
        
        number = - number;
        System.out.println(number);
        
        number= number * -1;
        System.out.println(number);

        //Inversão de valores
        int number2 = 100;
        System.out.println(number2);
        number2 = number2 + 10;
        System.out.println(number2);
        number2 = number2++;
        System.out.println(number2 ++);

        boolean variavel = true;
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);
        

        //Operadores ternários

        int x, y;

        x = 9;
        y = 6;

        String result = x == y ? "YES" : "NO";
        System.out.println(result);
        int result2 = x == y ? 100 : 101;
        System.out.println(result2);
        boolean result3 = x == y ? true : false;
        System.out.println(result3);

         //Operadores Comparação
         // == | >= | <= | != and equals

         int a = 1;
         int b = 2;

         boolean yesNo = a == b;
         System.out.println("a equals b? => " + yesNo);
         yesNo = a > b;
         System.out.println("a big b? => " + yesNo);
         yesNo = a < b;
         System.out.println("a small b? => " + yesNo);
         yesNo = a != b;
         System.out.println("a different b? => " + yesNo);


         String nameOne = "Jean";
         String nameTwo = new String("Jean");
         boolean trueFalse = nameOne == nameTwo;
         System.out.println("nameOne is equals nameTwo? => "+ trueFalse);
         trueFalse = nameOne.equals(nameTwo);
         System.out.println("nameOne is equals nameTwo? => "+ trueFalse);

          //Operadores Lógicos
          // && | || | !

          boolean conditions1 = true;
          boolean conditions2 = false;

          if (conditions1 && conditions2) {
            System.out.println("as conditins two is true");            
          }

          if (conditions1 || conditions2) {
            System.out.println("one of conditins two is true");            
          }

    }
}
