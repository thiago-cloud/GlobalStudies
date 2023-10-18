
import java.util.Scanner;

public class teste{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String veiculo = "";
         float velVeiculo,velPermitida = 0f;


        System.out.println("Informe o tipo de veiculo (caminhao/passeio): ");
        veiculo = entrada.nextLine();
        
        System.out.println("Informe a velocidade do véiculo: ");
        velVeiculo = entrada.nextFloat();
        

        System.out.println("Informe a velocidade permitida: ");
        velPermitida = entrada.nextFloat();

        if(veiculo.equals("passeio") && velVeiculo >= velPermitida * 1.1){
            System.out.println("Multa do veiculo passeio!");
        }else if(veiculo.equals("caminhao") && velVeiculo >= velPermitida * 1.05){
            System.out.println("Multa do caminha!");
        }else{
            System.out.println("Sem multas!");
        }

    }
}