package pacote.java.excecoes;

public class TesteExcecoesChecadas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);
        try {
            cc.sacar(110);
        } catch (SaldoInsuficienteException e) {

        }finally {
            System.out.println("Obrigado por utilizar nosso sistema");
        }
        System.out.println("Saldo: "+cc.getSaldo());
        //Captura o erro e mostra uma mensagem

    }
}
