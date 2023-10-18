public class acessandoObjeto2 {
    public static void main(String[] args) {
        Notebook laptop = new Notebook();

        laptop.modelo = "Ideapad330";
        laptop.fabricante = "lenovo";
        laptop.cor = "Prata";
        laptop.preco = 2000;



        laptop.dono1 = new proprietario();//A variavel dono1 aponta para a classe proprietario1
        laptop.dono1.nome = "jiribo";
        System.out.println(laptop.dono1.nome);

    }
}
