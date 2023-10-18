public class arcondicionado {
   private int Temperatura; // O private serve para encapsular o atributo ou seja so e possivel atribuir um valor a esse atributo, atravês de um método
    //que aponte para o atributo que nesse caso e o método trocarTemperatura



   public void trocarTemperatura(int Temperatura){
       if(Temperatura>= 17 && Temperatura<=25){
           this.Temperatura = Temperatura;
       }//Método que aponta para temperatura
   }

    public int obterTemperatura(){
        return Temperatura;//Esse método retorna o valor que de temperatura que estar em trocarTemperatura
    }//O public significa que e um método que pode ser acessado de qualquer lugar.

}

