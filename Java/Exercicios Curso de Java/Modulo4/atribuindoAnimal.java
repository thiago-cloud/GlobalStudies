public class atribuindoAnimal {
    public static void main(String[] args) {
        Animal animais = new Animal("jumper","cachorro","Preto",10,"Mamifero");//Ao utilizarmos o constructor podemos atribuir valores ao novo objeto animal

        //animais.nome = "bingo";
        System.out.println("Especie: "+animais.especie);
        System.out.println("Nome: "+animais.nome);
        System.out.println("Idade: "+animais.idade);
        System.out.println("Cor: "+animais.cor);

        System.out.println("   ");


        Animal animal1 = new Animal("giga","Pato","Branco",7,"Oviporo");
        System.out.println("Especie: "+animal1.especie);
        System.out.println("Nome: "+animal1.nome);
        System.out.println("Cor: "+animal1.cor);
        System.out.println("Idade: "+animal1.idade);
        System.out.println("Tipo: "+animal1.tipo);
    }
}
