


//Exerecicio de Orientação a objetos.
public class PetShop {
    public static void main(String[] args) {
        ClasseCachorro cachorro = new ClasseCachorro();
        cachorro.nome = "pepela";
        cachorro.idade = 10;
        cachorro.Raca = "pincher";
        cachorro.sexo = "F";

        System.out.println("nome do cachorro: "+cachorro.nome);
        System.out.println("idade do cachorro: "+cachorro.idade);
        System.out.println("Sexo do cachorro: "+cachorro.sexo);
        System.out.println("Raça do cachorro: "+cachorro.Raca);
    }
}
