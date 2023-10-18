import javax.sound.sampled.SourceDataLine;


import java.util.Scanner;

public class URI1008 {
    
//O numero de horas trabalhadas em um mes
//O funcionario recebe por hora
//imprima o salario que ele recebera no final do mês
//Der um numero qualquer o funcionario e imprima na tela
// 1 mes tem 720h

    public static void main(String args[]){

        int numero,tempo;
        float dinheiro,salario;

        Scanner input = new Scanner(System.in);

        System.out.println("Olá funcionario informe seu numero por favor: ");
        numero = input.nextInt();

        System.out.println("Quanto você recebe por hora: ");
        dinheiro = input.nextFloat();
        
        System.out.println("Quantas horas você trabalhou: ");
        tempo = input.nextInt();

        salario = tempo * dinheiro;

        System.out.println("Número: "+numero);
        
        System.out.println("Salario: "+salario);

        





    }




}
