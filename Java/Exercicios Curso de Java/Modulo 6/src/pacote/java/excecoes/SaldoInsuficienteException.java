package pacote.java.excecoes;
//Classe de exceção pra que ela seja uma classe de exceção ou seja pra que ela funcione dentro do try catch e necessario extender ela com a classe exception.
//Exceção checada
//Toda exceção que extender uma classe excption é uma exceção checada.



public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);//Estou chamando o contrutor da classe exception e passando o parametro mensagem
    }

}
