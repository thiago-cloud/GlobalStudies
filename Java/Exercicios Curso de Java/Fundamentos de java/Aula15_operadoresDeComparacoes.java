public class Aula15_operadoresDeComparacoes {
    public static void main(String args[]){
        int a = 10;
        int b =15;
        int c = 20;


    boolean maior = a > b;
    boolean maiorOuIgual = b <= a;
    boolean menorOuIgual =  c > a;
    boolean menor = b >= c;
    boolean diferente = a != b;
    
    System.out.println(maior);
    System.out.println(maiorOuIgual);
    System.out.println(menorOuIgual);
    System.out.println(menor);
    System.out.println(diferente);


    boolean bloqueado = true;
    bloqueado = !bloqueado;//O exclamação permiti inverter o valor

    System.out.println(bloqueado);




    }
}
