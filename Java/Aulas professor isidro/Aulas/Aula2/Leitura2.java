

import java.util.Scanner;

public class Leitura2 {
    
    public static void main(String args[]){
        String b;
        char c;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        b = entrada.nextLine();
        System.out.println("O seu nome é: "+b);

        System.out.println("Agora digite um  letra: ");
        c = entrada.nextLine().charAt(0);
        System.out.println("A letra digitada foi: "+c);



        


    }

}
