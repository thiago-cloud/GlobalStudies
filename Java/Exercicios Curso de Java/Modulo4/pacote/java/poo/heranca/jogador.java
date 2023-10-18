package pacote.java.poo.heranca;
//Apesar de não termos nenhuma propriedade na classe jogador e possivel intaciar um objeto apartir dela e atribuir valores. porque toda propriedade que e da classe pai
//e também da classe filha.
public class jogador extends Pessoa{

        protected boolean aindaJoga = false;

        //método

        protected void dizerSejoga(){
            System.out.println("Você ainda joga? "+aindaJoga);
        }

}
