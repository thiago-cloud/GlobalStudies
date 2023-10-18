
import java.util.Scanner;


public class veiculo {
 
 //Atributos
 
    String marca;
    String modelo;
    int placa;
    String cor;

    boolean ligar;
    int velMaxima;
    int velInicial;
    
//Métodos
void estadoDoMotor(){
    Scanner entrada = new Scanner(System.in);
    int acionar;
    acionar = 0;

    System.out.println("Deseja ligar ou desligar o seu carro: ");
    System.out.println(" 1 para ligar");
    System.out.println(" 2 para desligar");
    acionar = entrada.nextInt();
    
    switch (acionar){
        case 1:
            ligar = true;
        System.out.println("O seu carro da marca "+marca+" estar ligado!");
        break;
        
        case 2:
            ligar = false;
        System.out.println("O seu carro da marca "+marca+" estar desligado");
        break;

    }


    
}


void percorrer(){
    Scanner entrada = new Scanner(System.in);
    velInicial = 0;
    velMaxima = 0; 

    System.out.println("Informe  Quantos Km Deseja percorrer: ");
    velMaxima = entrada.nextInt();

    while(velInicial <= velMaxima){
        System.out.println(velInicial);
        velInicial++;
        }
        System.out.println("\""+velMaxima+" KM percorrido\" ");
    }

void nomeMarca(){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a marcar do seu carro: ");
    marca = entrada.nextLine();

    System.out.println("A marca do seu carro é "+marca);


    }
    void corVeiculo(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a cor que deseja: ");
        cor = entrada.nextLine();

        System.out.println("A cor escolhida foi: "+cor);

    }





}





