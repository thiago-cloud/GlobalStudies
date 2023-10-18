
import java.util.Scanner;


public class CalculadoraProfessor {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        float raio;
        raio = 0f;
        
        float pi;
        pi = 3.14f;

        float area;
        area = 0f;

        System.out.println("Informe o raio do circulo para saber a área: ");
        raio = entrada.nextFloat();

        area = raio * raio * pi;
        System.out.println("O resultado da área do circulo é: "+area);


    }
}
