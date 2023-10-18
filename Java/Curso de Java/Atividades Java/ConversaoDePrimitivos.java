public class ConversaoDePrimitivos{
    public static void main(String[] args){
        /*int x = 10;
        long y = x;
        System.out.println(y)*/// Converter um int para long o compilador do java não ira executar ele mostrara um erro
        // Esse metodo abaixo e chamado de casting e uma maneira de fazer conversão de vairaveis.
        int x = 11;
        long y = (int) x;
        System.out.println(y);
        //Ja para as variaveis de bit menor se for para converter do menor para o maior não precisa do casting
    }
}