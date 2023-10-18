import java.util.Scanner;

public class matriz {
    public static void main(String args[]){
        //Matriz também chamada de array bidimensional
        Scanner entrada = new Scanner(System.in);

        String matriz[][];// Por ser uma matriz deve se declarar dessa forma uma array para coluna e outra para linha

        matriz = new String[3][3];//A minha matriz recebe 3 colunas e 3 linhas uma matriz quadrada

        System.out.println("Informe os devidos valores: ");

        //Linha 0
        matriz[0][0] = entrada.nextLine();
        matriz[0][1] = entrada.nextLine();
        matriz[0][2] = entrada.nextLine();

        matriz[1][0] = entrada.nextLine();
        matriz[1][1] = entrada.nextLine();
        matriz[1][2] = entrada.nextLine();

        matriz[2][0] = entrada.nextLine();
        matriz[2][1] = entrada.nextLine();
        matriz[2][2] = entrada.nextLine();
        



    }
}
