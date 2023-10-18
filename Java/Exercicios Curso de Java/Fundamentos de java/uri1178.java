import java.util.Scanner;

public class uri1178{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double vetor[] = new double[100];

        System.out.println("Informe um valor: ");
        vetor[0] = entrada.nextDouble();
        System.out.println("Vetor[0]= "+vetor[0]);

        for(int pos = 1;pos< vetor.length; pos++){
            vetor[pos] = vetor[pos - 1]/2;
            System.out.println("vetor["+pos+"]= "+vetor[pos]);
        }




    }
}