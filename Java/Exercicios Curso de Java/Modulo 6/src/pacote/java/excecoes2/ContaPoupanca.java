package pacote.java.excecoes2;

public class ContaPoupanca {

    private double saldo;

    private double saque;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setDeposito(double deposito){
        if(deposito <= 0){
            throw new IllegalArgumentException("Operação inválida");
        }
        this.saldo += deposito;
    }

    public void setSaque(double quantidade){
        this.saldo -= quantidade;
    }
    public double getSaque(){
        return saque;
    }




}
