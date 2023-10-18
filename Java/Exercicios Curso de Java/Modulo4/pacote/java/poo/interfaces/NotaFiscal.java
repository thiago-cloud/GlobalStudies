package pacote.java.poo.interfaces;

public class NotaFiscal implements Imprimivel,EnviavelPorEmail{

    private int numero;
    private String pedido;

    public void setPedido(String pedido){
        this.pedido = pedido;
    }
    public String getPedido(){
        return pedido;
    }

    public NotaFiscal(int numero){
        this.numero = numero;
    }


    public void imprimir() {
        System.out.println("Vamos imprimir essa nota fiscal de numero "+numero);
    }
    public void enviar(String email){
        System.out.println("nota fiscal de numero "+numero+" Enviado ao email: "+email);
    }





}
