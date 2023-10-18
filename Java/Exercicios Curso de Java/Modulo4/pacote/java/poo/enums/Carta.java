package pacote.java.poo.enums;

public class Carta {
    private int numero;
    private Naipe naipe;//Essa propriedade naipe so pode receber quatro valores possiveis ou seja sera contantemente os mesmo valores da classe enum.

    public Carta(int numero, Naipe naipe){
        this.numero = numero;
        this.naipe = naipe;

    }
    //Método
    public void imprimirCarta(){
        System.out.println("Sou "+numero+" de "+naipe+" e tenho cor "+naipe.getCor());
    }


}
