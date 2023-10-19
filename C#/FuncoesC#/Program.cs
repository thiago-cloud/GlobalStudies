using System.Security.Cryptography.X509Certificates;

class program{
    public static void Main(string[] args){
        //Local Tipo Retorno Nome(Paramentro){}
        /*EX: public static void depositar(decimal deposito){
                saldoTotal = saldo + deposito
        }
        O local é o tipo não é obrigatorio
        */

        /*Local: public, private, interval, protected
        Nome: Nome da função
        Tipo: Static
        Retorno: void, int, bool, string, double*/


        //Console.WriteLine(calc());
        tabuada(5);

        



        }

        public static int calc(){
        int a = 1;
        int b = 5;
        int c = a+b;

        return c;
        }


        public static void tabuada(int numero){
            for(int i = 1; i <= 10; i++){
                Console.WriteLine(numero+" x "+i+" = "+i*numero);
            }

        }


    }

        


public class program2{

        public static int teste(int a, int b){
            int c;
            c = a+b;
            return c;
        }
}



//Função recursiva e o ato de uma função chamar a mesma função executando uma ação de forma recursiva entrando em looping
//Vantagens: Diminui a repertição de código
//Desvantagem: Complexidade no entendimendo do código