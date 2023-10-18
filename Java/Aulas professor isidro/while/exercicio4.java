
import java.util.Scanner;


public class exercicio4{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int valor;
        int resultado;
        int cont;
        Float media;

        resultado = 0;
        cont = 0;
        media= 0f;

        System.out.println("Informe 5 numeros positivos: ");
        for(int i = 1; i<=5 ; i++){
            valor = entrada.nextInt();
            if(valor>0){
                resultado = resultado + valor;
                cont++;
            }
        }
        media = (float) (resultado/cont);
        System.out.println("Valor total: "+resultado);
        System.out.println("Valores  positivos digitados: "+cont);
        System.out.println("Média: "+media);

    }
}