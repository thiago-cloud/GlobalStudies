import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class exercicio5{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        float numero;
        int cont;
        int resultado;

        numero = 0f;
        cont = 1;
        resultado = 1;

        System.out.println("Informe um numero: ");
        numero = entrada.nextFloat();

       while (cont <= 6){
        if((numero %2) == 1){
            System.out.println(numero);
        }
        
           cont++; 
        }
        

       }


    }
}