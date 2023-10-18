public class atribuindoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.Nome = "Irineu";
        pessoa.Sobrenome = "Silva";


        pessoa.alterarNome("jose");//Nome alterado


        System.out.println("Meu nome é "+pessoa.Nome+" da "+pessoa.Sobrenome);
    }


}
