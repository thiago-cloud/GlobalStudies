import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class gravandoArquivo {
    public static void main(String[] args) throws IOException {

        String[] emails = {"jurubeba3@gmail.com","carlinho23(3)@htmail.com","irineu(3)@gmail.com","juarez(3)@gmail.com"};

       // BufferedWriter writer = null; //Armazenamento temporario



        try(PrintStream writer = new PrintStream("email2.txt")){
            //writer = new BufferedWriter(new FileWriter("emails.txt", true));//Aki ele vai criar um arquivo emails.txt na variavel write, o true adiciona novos emais
            //A medida em que vamos executando o código. sem o true toda vez que executamos o código ele simplesmente vai reescrever.

            for(String email : emails){
               // writer.write(email);
              //  writer.newLine();//Pular a linha das strings do arquivo
                writer.println(email);// imprime na tela cada indice do arry emails
            }

        }
        /*finally{
            try{
                writer.close();

            }catch (IOException e){

            }*/

        }


    }




