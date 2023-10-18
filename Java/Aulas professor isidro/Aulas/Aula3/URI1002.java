
import java.util.Scanner;
public class URI1002 {
    public static void main(String args[]){
        double r;
        double A;
        

        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculando a area de um circulo: ");
        System.out.println("Informe o raio do circulo: ");
        r = entrada.nextDouble();
        A = Math.PI * Math.pow(r, 2);
        System.out.println("O valor da area de um circulo e igual a: "+A);

    }

    
}
