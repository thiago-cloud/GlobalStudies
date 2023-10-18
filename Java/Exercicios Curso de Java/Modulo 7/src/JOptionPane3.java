import javax.swing.*;

public class JOptionPane3 {
    public static void main(String[] args) throws Exception {



        //Mostra uma caixa de dialogo com 3 opções de escolha aki no caso o sim o não e o sim com e-mail.

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] opcoes ={ "Sim","Não", "Sim, Com e-mail"};//Array de object

        int opcao = JOptionPane.showOptionDialog(null,"Você gostaria de finalizar o cadastro?","Confirmar",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
                null,opcoes,opcoes[2]);//Yes_No_cancel_option da 3 opcoes [2] significa que eu quero que a opção do indice 2 do array seja selecionada


        System.out.println("Opcao selecionada: "+opcao);

        if(opcao == 1){

        }
    }



}
