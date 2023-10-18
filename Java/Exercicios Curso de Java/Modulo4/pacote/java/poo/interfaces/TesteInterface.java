package pacote.java.poo.interfaces;




public class TesteInterface {
    public static void main(String[] args) {
        //No imprimivel não temos a implementação a implementação estar em nota fiscal por isso que ele chama em nota fiscal.

        Imprimivel i = new NotaFiscal(1245);//Não podemos dar new numa interface craimos um objeto em notafiscal como nome i e acessando ele ao objeto do tipo imprimivel.
        i.imprimir();



        //Adicionando um casting

        EnviavelPorEmail e = (EnviavelPorEmail) i;
        e.enviar("jurubeba555@gmail.com");
        //Adicionando um casting

        NotaFiscal P = (NotaFiscal) i;
        P.setPedido("Beterraba");

        System.out.println("Pedido "+P.getPedido());

    }




}
