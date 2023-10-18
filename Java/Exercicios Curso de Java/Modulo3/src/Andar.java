public class Andar {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.Cachorro = new Animal();

        //Atribuiindo valores a pessoa
        pessoa.nome = "Jurubeba";

        //Atribuindo valores ao cachorro
        pessoa.Cachorro.nome = "jib";
        pessoa.Cachorro.cor ="branco";
        pessoa.Cachorro.raca = "PitBull";

        System.out.println("meu nome é "+pessoa.nome+" estou passeando com o meu cachorro "+pessoa.Cachorro.nome);

    }

}
