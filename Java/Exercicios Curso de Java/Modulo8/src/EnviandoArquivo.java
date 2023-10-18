import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoArquivo {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("email2.txt"))){
            String email = reader.readLine();//Ler a linha inteira email

            while(email != null && !email.trim().equals("")){
                System.out.println("Enviando Email para: "+email);
                email = reader.readLine();
            }//enquanto existir um email na linha executa loop enviar emails

        }catch(IOException e){
                System.err.println("Não conseguiu ler o arquivo"+e.getMessage());

        }
    }
}
