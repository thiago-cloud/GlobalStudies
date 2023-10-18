public class StringBuilderStringBuffer {
    public static void main(String[] args) {

        //String Builder e StringBuffer
        /**
         * A diferença do string buider para o string buffer é que o string builder visa mais o desempenho da aplicação ja o string buffer executa a concatenação em uma determinada ordem.
         * ou seja o stringBuffer e threader safe é o string Builder não é thread safe
         */


        StringBuffer sb = new StringBuffer();
        sb.append("Bem vindo ao java ");
        sb.append("uma liguagem de programação extremamente verbosa ");
        sb.append("é um caminho longo");


        System.out.println(sb.toString());//O toString confirma a concatenação mas ele opcional ja que sem ele a concatenação funcionaria do mesmo jeito.

        sb.insert(20, " AlgaWork ");//O insert concatena a string na posição definida.

        System.out.println(sb);

        //StringBuilder

        StringBuilder sbi  = new StringBuilder();

        sbi.append("O javascript é uma liguagem de programação");
        sbi.append("Extremamente poderoso hoje em dia é usado em diversas aplicações ");
        sbi.append("porem como tudo na area de tecnologia, é apenas uma ferramenta!");


        System.out.println(sbi);



    }
}
