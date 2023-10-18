public class ComparacaoEIgualdade {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 60;
        boolean comparacao1 = a<b;//O a e menor que b
        boolean comparacao2 = b>a;// O b é maior que a
        boolean comparacao3 = c<=a;//O c e menor ou igual a a
        boolean comparacao4 = c>=b;// O c e maior ou igual a a
        boolean comparacao5 = c==b;//O c e igual a b
        boolean comparacao6 = c!=a;// O c é diferente de a

        //Invertendo o valor de uma varivel booleana
        //O valor desse boolean ta true
        boolean inverter = true;
        System.out.println(inverter);
        //O valor desse boolean agora sera false
        inverter = !inverter;
        
        System.out.println(inverter);

        System.out.println(comparacao1);
        System.out.println(comparacao2);
        System.out.println(comparacao3);
        System.out.println(comparacao4);
        System.out.println(comparacao5);
        System.out.println(comparacao6);
    }
}