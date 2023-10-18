public class variavelAponta {
    public static void main(String[] args) {
        Notebook laptop = new Notebook();

        laptop.modelo = "Think pad";
        laptop.fabricante = "Lenovo";
        laptop.cor = "Preto";
        laptop.preco = 1000;

        Notebook laptop2 = new Notebook();

        laptop2.modelo = "Asus";
        laptop2.cor = "Prata";
        laptop2.preco = 2000;

        laptop.dono1 = new proprietario();

        laptop.dono1.nome = "jurubeba";
        laptop.dono1.cidade = "Sao paulo";
        laptop.dono1.idade = 45;




        System.out.println(laptop.dono1.nome + " e dono do notebook " + laptop.modelo);
        System.out.println(laptop.dono1.nome + " e dono do notebook " + laptop2.modelo);


    }


}











