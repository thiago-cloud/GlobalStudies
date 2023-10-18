package pacote.java.poo.sobrecarga;

public class CadastrarPessoa {


        //Agora iremos chamar o metodo armazenar que estar privado para que quando invoquemos o metodo armzenar ele imprima nome e idade na tela


        //Apartir desse método precisamos de intanciar um objeto alem disso ele recebe o parametro aki no caso una variavel pessoa.
        public void cadastrar(Pessoa pessoa){
            armazenar(pessoa.getNome(),pessoa.getIdade());
        }//Agenta ira pegar nome e a idade e jogar no armazenar apartir desse método.


        private void armazenar(String nome,int idade){
            System.out.println("Salvando: "+nome+" com "+idade+" anos");
        }
        //Apartir desse método não precisaremos instaciar o objeto basta colocarmos os valores. Além disso ele recebe o parametro do tipo string e do tipo inteiro.
        public void cadastrar(String nome, int idade){
            armazenar(nome,idade);
        }


}
