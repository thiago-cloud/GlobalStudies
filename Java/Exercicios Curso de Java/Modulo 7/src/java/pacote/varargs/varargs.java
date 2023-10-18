package java.pacote.varargs;

public class varargs {
    public void enviarEmailss(String... emails){
         //Percorrendo todos os emails recebidos
        //String com 3 pontos significa dizer que o numero de argumentos passado dentro da string e variado. isso siginifica que o tamanho do array é variado

        for(String email : emails){
            System.out.println("Email enviado para "+email);
        }
    }
}
