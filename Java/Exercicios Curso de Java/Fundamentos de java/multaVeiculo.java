
import java.net.SocketImpl;
import java.util.Scanner;



public class multaVeiculo {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        float velPermitida,velVeiculo;
        String veiculo = "";

        System.out.println("Informe o tipo de véiculo se é passeio ou caminhão: ");
        veiculo = entrada.next();


        System.out.println("Informe a velocidade do veiculo: ");
        velVeiculo = entrada.nextFloat();

        System.out.println("Informe a velocidade permitida da via: ");
        velPermitida = entrada.nextFloat();

        if(veiculo.equals("passeio")  && velVeiculo >= velPermitida * 1.1){
            System.out.println("Multa do veiculo de passeio!");
        }else if(veiculo.equals("caminhao")&& velVeiculo>= velPermitida * 1.05){
            System.out.println("Multa do caminhão!");
        }else{
            System.out.println("Não há multas!");
        }

    }
}
