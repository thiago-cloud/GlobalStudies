
import java.util.Scanner;
public class URI1064 {
    public static void main(String args[]){
        
        int contador;
        contador = 1;
        float valor;
        float media;

        Scanner input = new Scanner(System.in);
        
        while(contador<=6){
        System.out.println("Informe o "+contador+"º valor: ");
        valor = input.nextInt();
        contador++;
        if(valor > 0){
            media += valor;
            contador++;
            }
        }

        
            
           
        }
    }

