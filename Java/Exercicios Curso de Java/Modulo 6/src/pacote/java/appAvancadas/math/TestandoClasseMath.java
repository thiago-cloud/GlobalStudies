package pacote.java.appAvancadas.math;

import java.util.Scanner;

import static java.lang.Math.PI;//O static significa que estamos pegando apenas um item da biblioteca math que no caso aki é o pi.

public class TestandoClasseMath {
    public static void main(String[] args) {

        //Sem o math
        Scanner entrada = new Scanner(System.in);
        //Comprimento de uma circunferencia 2*r *PI
        double pi = 3.14;//O observermos que 3,14 e uma contante no lugar de colocarmos o pi como uma variavel poderiamos simplemente colocar math.PI que é 3,14
        double r;

        System.out.println("Infrome o raio da circunferencia: ");
        r = entrada.nextDouble();
        double comprimento = 2 * r * pi;
        System.out.println("O comprimento do raio é igual a:"+comprimento);

        //Maximo é Minimo

        double[] precos = {30.5,59.90};
        System.out.println("O maior preco é: "+Math.max(precos[0],precos[1]));//A biblioteca math.max verifica qual é o maior numero dentro de uma determinada array.
        double menorPreco = Math.min(precos[0],precos[1]);
        System.out.println("O menor preço é "+menorPreco);

        //Potencia

        System.out.println("A potencia de 2 elvado a 9 é "+Math.pow(2,9));

        //Raiz Quadrada

        System.out.println("A raiz quadrada de 9 é: "+Math.sqrt(9));

        //Arrendondamento ceil,floor e round




    }
}
