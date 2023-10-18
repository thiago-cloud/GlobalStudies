
import java.util.Scanner;


public class javaArray {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        String vetor[];
        vetor = new String[10];

        System.out.println("Digite 10 strings: ");
        for(int pos = 0 ; pos < vetor.length ; pos++){
            vetor[pos] = entrada.nextLine();
        }
        System.out.println("-------------------------------------------");
        for(int pos = 0 ; pos< vetor.length ; pos++){
            System.out.println("vetor["+pos+"]= "+vetor[pos]);
        }



        


    }
    
}
