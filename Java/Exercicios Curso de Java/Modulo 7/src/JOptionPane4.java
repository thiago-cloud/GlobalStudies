import javax.swing.*;

public class JOptionPane4{
    public static void main(String[] args)throws Exception {

       //Gera uma mensagem que mostra as opções sexo masculino é feminino

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());


        Object[] possibilidades = {"Masculino","Feminino"};
        String sexo = (String) JOptionPane.showInputDialog(null,"Selecione o sexo: ","Algaworks",JOptionPane.PLAIN_MESSAGE,null,possibilidades,possibilidades[0]);


        System.out.println("Sexo selecionado: "+sexo);

        //Para o usuario digitar algo na caixa de dialogo.

        String nome = (String) JOptionPane.showInputDialog(null,"Digite seu nome: ","AlgaWorks",JOptionPane.PLAIN_MESSAGE,null,null,null);

        System.out.println("Nome: "+nome);


    }
}
