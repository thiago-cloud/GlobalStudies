package pacote.java.poo.heranca;

public class testandoHeranca {
    public static void main(String[] args) {

        jogador j = new jogador();

        j.nome = "Irineu";
        j.idade = 50;
        j.sobrenome = "Silva";
        j.bairro = "Prazeres";
        j.estado = "Pernambuco";
        j.cidade = "Jaboatão dos Guararapes";

        j.seApresentar();
        j.dizerSejoga();

        Pessoa p1 = new Pessoa();

        //p1.dizerSejoga();// Repare que no caso das propriedades exercidas pela classe filho a classe pai não tem acesso



        System.out.println(j.nome+" da "+j.sobrenome);

    }



}
