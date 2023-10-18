public class ExemploDeClasseString2 {
    public static void main(String[] args) {
        //Cadeia de caracteres
        //Isso significa que cada caracteres estar posicionado em uma determinada posição

        String s = "Bostil";

        System.out.println(s.charAt(0));//ele vai imprimir uma letra de acordo como a posição definida.

        System.out.println(s.length());//Permite mostrar a quantidade de caracterer


        try{
            System.out.println(s.charAt(20));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Esse indice não existe dentro dessa string: "+e.getMessage());
        }
    }
}
