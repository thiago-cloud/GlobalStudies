public class String4 {

    public static void main(String[] args) {
       /* String a = "Curso_De_Java_Da_AlgaWorks";

        String[] array = a.split("_");//Cada _ Serve para separar as palavras de acordo com definição do metodo split

        for (int i = 0; i <= array.length; i++) {
            System.out.println("[" + i + "] " + array[i]);
        }*/
        //indexOf é LastIndexOf

        String Linguagem = "JavaScript";
        int resultado = Linguagem.indexOf('i');
        System.out.println(resultado);//Ele vai pegar a primeira posição da letra f dizer qual o indice.

        String Linguagem2 = "Java";

        int resultado2 = Linguagem2.lastIndexOf('a');//Aki ele informa em qual indice estar o ultimo a.

        System.out.println(resultado2);

        //replaceAll

        String b = "Desenvolvimento de Software";

        String resultado3 = b.replace("de Software", "Js");

        System.out.println(resultado3);//Aki ele basicamente vai subistituir um string ja existente por outra criada.





    }
}
