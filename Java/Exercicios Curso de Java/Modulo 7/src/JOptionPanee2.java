import javax.swing.*;
import javax.swing.JOptionPane;
import java.net.URL;
public class JOptionPanee2 {

    public static void main(String[] args) {




        JOptionPane.showMessageDialog(null,"Cadastro concluido com sucesso!");

        JOptionPane.showMessageDialog(null,"Atenção - Email não informado","Atenção ",JOptionPane.WARNING_MESSAGE);//JOptionPane.WARNING_MESSAGE mostra o icone de exclamação

        JOptionPane.showMessageDialog(null,"Error informar um cpf válido","Error ",JOptionPane.ERROR_MESSAGE);//JOptionPane.ERROR_MESSAGE mostra o icone de erro



        //Mostrando uma imagem na caixa de dialogo

        JOptionPane.showMessageDialog(null,"Obrigado!","Obrigado",JOptionPane.PLAIN_MESSAGE);//Finaliza a mensagem

        URL url = JOptionPanee2.class.getResource("Louva_Deus.png");//Pegando a imagem icon.jpg. e colocando na classe JOptionPanee2.
        Icon icon = new ImageIcon(url);

        JOptionPane.showMessageDialog(null,"Obrigado VEEI"," == ",JOptionPane.INFORMATION_MESSAGE,icon);//Mostrando a imagem




    }
}
