public class acessandoObjetos {
    public static void main(String[] args) {
       proprietario dono1 = new proprietario();

       dono1.nome = "Irineu da Silva";
       dono1.cpf = "000.000.000.-00";
       dono1.idade = 50;
       dono1.cidade = "Recife";
       dono1.bairro = "Derby";
       dono1.logradouro = "Rua do borundi";

       System.out.println("Meu nome é "+dono1.nome);
        Carro meuCarro = new Carro();

        meuCarro.anoDeFabricacao = 2020;
        meuCarro.modelo = "Vectra";
        meuCarro.cor = "vermelho";
        meuCarro.fabricante = "ford";
        meuCarro.dono = dono1;

        //Outra forma de instanciar

        meuCarro.dono = new proprietario();

        meuCarro.dono.nome = "jurubeba";

        System.out.println(meuCarro.dono.nome);
        System.out.println(dono1.nome);



    }
}
