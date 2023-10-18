package pacote.java.excecoes2;

public class TesteExcecao {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();

        cp.setSaldo(100);


        System.out.println("saldo: "+cp.getSaldo());

        try{
            cp.setDeposito(0);
        }catch(IllegalArgumentException e){
            System.out.println("Voce digitou um valor menor que 0 "+e.getMessage());
        }

    }
}



