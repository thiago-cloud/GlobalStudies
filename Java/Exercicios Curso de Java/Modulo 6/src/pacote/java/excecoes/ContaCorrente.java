package pacote.java.excecoes;

public class ContaCorrente {

   public double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    public void depositar(double deposito){
        if(deposito <= 0) {
            throw new IllegalArgumentException("O valor não pode ser menor do que zero");//Tratando a exceção se caso for colocado um valor negativo para o deposito
            //mostrara essa mensagem na tela.
        }
            this.saldo += deposito;
    }
    public void sacar(double quantidade)throws SaldoInsuficienteException{
        double saldoTemp = saldo - quantidade;
        if(saldoTemp<0){
            throw new SaldoInsuficienteException("Ops não é possuvel mais fazer saque saldo insuficiente.");
        }
        this.saldo -= quantidade;
    }//como se trata de uma exceção checada e necessario colocar o throws antes.

    public double getSaldo(){
        return this.saldo;
    }
}

