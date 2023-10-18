public class ExemploDeClasseString {
    public static void main(String[] args) {
        String nome;
        nome = "Jurubeba";
        System.out.println(nome.toUpperCase());//Esse método permite deixar as letra maiuscula


        //Comparação das strings
        String nome1 = "Irineu";
        String nome2 = "Irineu";

        System.out.println("nome1 é igual nome2? "+(nome1 == nome2));


        String nome3 = new String("Irineu");//Apesar de termos as duas variaveis iguais o nome3 é diferente porquê ele aponta para aponta para outo objeto por conta do new

        System.out.println("nome2 é igual a nome3? "+(nome2 == nome3));

        //Comparando utilizando o toEquals

        System.out.println("nome1 é igual ao nome3? "+(nome1.equals(nome3)));//True o equals não compara os objetos compara os valores que há na variavel.

        //Comparando os valores das strings porem ignorando se maiuscula ou menuscula

        String nome4 = "JUarez";
        String nome5 = "JuArEz";


        System.out.println("Comparando: "+nome4.equalsIgnoreCase(nome5));//Apesar dos nomes terem letra maiusculas e minusculas em posições diferentes com esse método não importa os dois são uguais.



    }
}