package pacote.java.poo.Treinador;

import pacote.java.poo.animal.Cachorro; //Para utilizar classes de pacotes diferentes e necessario importar a classe

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        DonoCachorro dono = new DonoCachorro();

        cachorro.setNome("BINGO");

        System.out.println("Nome do cachorro: "+cachorro.getNome());
        dono.ensinarCachorroSentar(cachorro);




    }
}
