public class Aula11_conversaoDoTipoPrimitivo {
    public static void main(String arg[]){
        //conversão de um tipo primitivo para outro
        long x = 1;
        double z = 41245;
        double populacao = 123455645;
        byte minimo = 14;
        //casting 

        int y = (int ) x;//a variavel long x passou a ser a variavel y do tipo int
        System.out.println(y);

        float valor = (float) z;
        System.out.println(valor);

        float ops = (float) populacao;
        System.out.println(ops);

        int minimo1 = (byte) minimo;
        System.out.println(minimo1);
        

    }
}
