//Atributo e a informação sobre a classe
//Metodo e as ações que classe pode fazer
import java.util.Scanner;
public class televisao{
    
    //Atributos
    String marca;
    boolean ligado;
    String canal;
    int volume;

    //Métodos

    //A ideia é que todos os métodos acessem os atributos é modifiquem
    void ligar(){
        ligado = true;
        System.out.println("A tv da marca "+marca+" estar ligada");
    }

    void aumentarVolume(){
        if(ligado){
            int valor;
            valor = 0;
            volume = 0;

            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe o volume que deseja: ");
            valor = entrada.nextInt();
            System.out.println(" ");

            while(volume<=valor){
               System.out.println(volume);
                volume++;
            }
            System.out.println("A tv da marca "+marca+" estar no volume "+volume);
        }else{
            System.out.println("A tv precisa ser ligada primeiro!");
        }
    }

}