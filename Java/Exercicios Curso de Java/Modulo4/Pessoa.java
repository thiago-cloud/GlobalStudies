public class Pessoa {
    String Nome;
    String Cpf;
    int idade;
    String Sobrenome;
    double Altura;
    double Peso;

    void alterarNome(String Nome){
        if(Nome != null){
            this.Nome = Nome;//Esse this serve para referenciar a variavel nome da classe pessoa porque se não ela iria referenciar ao parametro nome.
        }//Esse metodo serve para alterar o nome sempre quando for acionado.

    /*void alterarSobrenome(String Sobrenome){
         if(Sobrenome != null){
             this.Sobrenome = Sobrenome;
            }
        }*/
    }

}
