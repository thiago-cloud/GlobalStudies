package java.pacote.varargs;

public class CorreioEletronico {
    public void enviarEmails(String[] emails){


        //Percorrer todos os emails recebidos
        for(String email : emails){
            //enviar e-mail
            System.out.println("Email enviado para"+email);
        }
    }//Temos uma lista com todos os email que ele vai passar


}
