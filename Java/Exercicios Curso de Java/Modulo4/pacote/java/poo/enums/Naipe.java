package pacote.java.poo.enums;

public enum Naipe {
    /*O enum serve para declarar valores absolutos ou seja contantes que não sera alterado seus valores.*/

    //As constantes sempre tem que ser declardas com letra maiusculas.

    //Naipe é um conjunto de simbolos que uma carta pode conter

    COPAS("Vermelho"),//Variavel cor atribuida a cada enum
    PAUS("Preto"),
    ESPADA("Preto"),
    OURO("Vermelho");


    //No enum podemos ter construtores
    String cor;
    Naipe(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

}
