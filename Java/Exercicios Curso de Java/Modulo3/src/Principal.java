public class Principal {

    //A ideia aki e criar uma classe principal.
    public static void main(String[] args) {
        Carro carro;//Declaramos a variavel no caso aki do tipo Carro que no caso é uma classe
        carro = new Carro();//Instanciamos a variavel com um objeto do tipo carro

        Carro meuCarro = new Carro();// aki ja fizemos tudo em uma linha declaramos a variavel meu carro que é intanciada apartir da classe carro.

        Carro seuCarro = new Carro(); //Apesar de ser duas variaveis diferentes mais apontando para o objeto com mesmo nome. estão apontando para o Objetos diferentes
        //Por isso tem o new que siginifica um novo objeto Carro.
        //Lembrando que a variavel tem a função de apontar para o objeto ou seja ela armazena o e endereço do objeto e esse endereço aponta para o objeto.


    }
}
