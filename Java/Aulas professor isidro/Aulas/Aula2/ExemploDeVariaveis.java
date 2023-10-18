public class ExemploDeVariaveis{
    public static void main(String arg[]){
        int a; // "a" e uma variavel do tipo inteiro ocupa 32 bits (4 bytes)   -  Valores de -2g a 2g
        long b; // "b" e uma variavel do tipo long as variaveis do tipo long tem uma capacidade maior de aramazenamento comparando ao int cerca  64 bits que e 8 bytes  - valores de  -9p a 9p
        short c; //ocupa 16 bits (2 bytes)    - valores de -32.768 a 32.767
        byte d; // ocupa 8 bits (1 byte)    -  valores de -128 a 127

        a = 200;
        b = 3000000;
        c= 4000;
        d = 15;

        System.out.println("O valor de a e igual a: "+a);
        System.out.println("O valor de b e igual a: "+b);
        System.out.println("O valor de c e igual: "+c);
        System.out.println("O valor de d e igual a: "+d);


    }
} 