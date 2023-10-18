import java.util.Scanner;



public class exercicio3{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        float valor;
        float media;
        int cont;

        media = 0f;
        cont = 1;

        for(int i = 1 ; i<= 6 ; i++){
            System.out.println("Informe o "+cont+"º numeros: ");
            valor = entrada.nextFloat();
            if(valor>=0)
                media+=valor;
                cont++;
        }
        media = media/cont;
        System.out.println("Os numeros positivos: "+cont);
        System.out.println("O valor da media: "+media);

    }
}