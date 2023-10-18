package pacote.java.poo.polimorfismo;

public class testePolimorfismo {
    public static void main(String[] args) {
        //Instanciando o objeto da classe Conta

        Conta conta1 = new Conta();

        conta1.setSaldo(5000);

        //System.out.println("O saldo da conta é: "+conta.getSaldo());//essa e maneira simples de imprimir

        //-------------------------------------------
        ContaCorrente contacorrente = new ContaCorrente();
        contacorrente.setSaldo(500);

        //System.out.println("O seu saldo da conta corrente é igual: "+contacorrente.getSaldo());
        //-------------------------------------------

        ContaPoupanca contapoupanca = new ContaPoupanca();
        contapoupanca.setSaldo(1000);
        //System.out.println("O seu saldo da conta poupança é: "+contapoupanca.getSaldo());

      /*  public static void imprimirSaldo(Conta conta1){
            System.out.println("Saldo da conta: R$"+conta1.getSaldo());
        }*/


    }

}
