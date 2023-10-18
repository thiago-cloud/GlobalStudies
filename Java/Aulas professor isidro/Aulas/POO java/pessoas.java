

public class pessoas{
        public static void main(String args[]){
            classePessoa pessoa = new classePessoa();

            pessoa.setNome("Irineu");
            pessoa.setIdade(50);
            pessoa.setEmail("irineu");
            pessoa.setAltura(1.8);

            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getIdade());
            System.out.println(pessoa.getEmail());
            System.out.println(pessoa.getAltura());


        }
}