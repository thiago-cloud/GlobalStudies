import java.util.Collections;

public class acessandoAtributosDeObjetos {
    public static void main(String[] args) {

      //Atribundo valores ao objeto

       Carro novoCarro = new Carro();
       novoCarro.modelo = "gol";
       novoCarro.cor = "verde";
       novoCarro.anoDeFabricacao = 2022;
       novoCarro.fabricante = "Volkswagem";

       Carro carroVelho = new Carro();
       carroVelho.modelo = "golf gti";
       carroVelho.cor = "Preto";
       carroVelho.anoDeFabricacao = 1990;
       carroVelho.fabricante = "Volkswagem";

     


        //Acessando os atributos e imprimindo na tela

       System.out.println("Modelo: "+novoCarro.modelo);//Acessando o atributo modelo apartir da variavel novoCarro
       System.out.println("Cor: "+novoCarro.cor);
       System.out.println("Ano de Fabricação: "+novoCarro.anoDeFabricacao);
       System.out.println("fabricante: "+novoCarro.fabricante);

        System.out.println("  ");

       System.out.println("Modelo:"+carroVelho.modelo);
       System.out.println("Cor: "+carroVelho.cor);
       System.out.println("Fabricante: "+carroVelho.fabricante);
       System.out.println("Ano de Fabricação: "+carroVelho.anoDeFabricacao);
    }
}
