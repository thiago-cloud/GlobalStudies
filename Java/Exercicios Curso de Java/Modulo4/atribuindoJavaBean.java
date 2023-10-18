public class atribuindoJavaBean {
    public static void main(String[] args) {
        PessoaJavaBean  pessoa = new PessoaJavaBean();

        pessoa.setNome("Juarez");
        pessoa.setSobrenome("Rodrigues");
        pessoa.setCidade("Jaboatão dos Gurarapes");
        pessoa.setIdade(25);
        pessoa.setEstado("Pernambuco");
        pessoa.setCpf("000.000.000.00");


        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Sobrenome: "+pessoa.getSobrenome());
        System.out.println("Idade: "+pessoa.getIdade());
        System.out.println("Estado: "+pessoa.getEstado());
        System.out.println("Cidade: "+pessoa.getCidade());
        System.out.println("CPF: "+pessoa.getcpf());




    }
}