
import java.util.Scanner;


public class testeBreakContinue {
    public static void main(String args[]){
       /*  int valor;
        int contador;
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Digite um valor: ");
        valor = entrada.nextInt();
        
        contador = 1;
        while(contador <= valor){
            if(contador == 10 ){
                break;
                
            }
        System.out.println(contador);
        contador ++;
        }
        System.out.println("FIM");*/

        /* 
        int valor;
        int contador;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        valor = entrada.nextInt();

        contador = 1;
        while(contador<= valor){
            if(contador == 5){
                continue;//Aki com o continue ele ignora do 5 em diante alem dos outros blocos abaixo
            }
            System.out.println(contador);
            contador++;
        }
        System.out.println("Fim");

}*/

int valor;


Scanner entrada = new Scanner(System.in);

System.out.println("Informe um valor: ");
valor = entrada.nextInt();

for(int i = 0 ; i <= valor ; i++){
    if(i == 40){
        continue;
    }//O continue vai ignorar o 40 no for
    System.out.println(i);
        }


    }   
}