public class appTv {
    public static void main(String args[]){
        
        televisao tv = new televisao();//Iniciei a variavel tv do tipo televisao
        String acao;

        tv.canal= "globo";
        tv.marca = "LG";
        tv.ligar();

        tv.aumentarVolume();
        
    }
}
