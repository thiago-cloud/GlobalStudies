package java.pacote.varargs;

public class testeDeCorreioEletronico {
    public static void main(String[] args) {
        CorreioEletronico ce = new CorreioEletronico();
        /*
        String[] emails = new String[2];

        emails[0] = "joaodascostas@gmail.com";
        emails[1] ="judeus123@hotmail.com";

        ce.enviarEmails(emails);//pega o objeto ce mais o método mais o acrescimo da array de string emails

         */
        //OU

        //As duas formas funcionam para envio de email

        ce.enviarEmails(new String[] {"Jurubeba154@gmail.com", "irineu555@hotmail.com"});
    }


}
