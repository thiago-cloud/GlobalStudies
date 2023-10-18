package pacote.java.poo.sobrecarga;

public class testarCadastro {
    public static void main(String[] args) {
        CadastrarPessoa c1 = new CadastrarPessoa();

        Pessoa p1 = new Pessoa("pigmeu",60);//Aki eu estou passando os valores atribuidos para o objeto p1

        c1.cadastrar(p1);//Ao iniciar o metodo cadastra ele precisa de um objeto que ja tenha os valores que nesse caso e o p1;


        c1.cadastrar("girino",50);







    }

}
