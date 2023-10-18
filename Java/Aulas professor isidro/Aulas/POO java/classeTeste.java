
import java.util.Scanner;

public class classeTeste {
    private String nome;


    public void cadastro(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = entrada.nextLine();

    }

   public String getNome1(){
        return this.nome;
    }

}
