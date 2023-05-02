import java.util.Scanner;
public class SortVector {
    public static void main(String[] args) throws Exception {
        int qteNumerosDigitados;
        int vetor[];
        int auxiliar = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa recebe numeros inteiros e calcula o maior e o menor");
        System.out.println("\nInforme quantos numeros pretende digitar: ");
        qteNumerosDigitados = sc.nextInt();

        vetor = new int[qteNumerosDigitados];

        for (int i = 0; i < qteNumerosDigitados; i++) {

            System.out.println("\nInforme o " + (i + 1) + "º  valor e aperte Enter para continuar: ");
            vetor[i] = sc.nextInt();
        }

        //i = 0
        //j = 0
        //[5,10,19,20]
        for (int i = 0; i < qteNumerosDigitados; i++) {

            for (int j = 0; j < qteNumerosDigitados; j++) {
                
                //trocamos os valores do vetor caso posicao i seja menor que j
                if(vetor[i] < vetor[j]){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
                
            }
        }
        
        for (int k = 0; k < qteNumerosDigitados; k++) {
            System.out.println(vetor[k]);
        }

        sc.close();
    }
}
