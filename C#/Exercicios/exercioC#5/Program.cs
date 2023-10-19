


/*class program{
    public static void Main(string[] args){

        cadastro pessoa1 = new cadastro("Lucas","Ribeiro","20/05/1998");
        cadastro pessoa2 = new cadastro("Antonio","Junior","05/10/1990");

        



        List<string> nome = new List<string>();
            nome.valor = "escaravelho";
            nome.valor = "jumper";
            Console.WriteLine(nome.valor.Length);//length seria o tamanho da lista
    }
}
class List<P>{
    public P valor { get; set; }
}//P é o parametro é o valor seria o valor que sera atribuido a lista nome 





class cadastro{

    string nome;
    string sobrenome;
    string dataNascimento;

    public cadastro(string nome, string sobrenome, string dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;



    }

    public string getNome(){
        return nome;
    }





}
*/

/*
 class program{

    public static void Main(){

        Calculate calc = new Calculate(sum);


        Console.WriteLine(calc(1,2));

        static int sum(int a,int b){
            return a+b;
        }

    }




 }

delegate int Calculate(int x, int y);
 */


 class program{
    public static void Main(string[] args){

        calculate calc = new calculate(sum);
        calculate calc1 = new calculate(mult);
        calculate calc2 = new calculate(div);
        calculate calc3 = new calculate(exp);
        

        Console.WriteLine(calc(5,5));
        Console.WriteLine(calc1(10,6));
        Console.WriteLine(calc2(50,2));
        Console.WriteLine(calc3(20,2));

        static int sum(int a, int b){
            return a + b;
        }
        static int mult(int a, int b){
            return a * b;
        }

        static int div(int a,int b){
            return a/b;
        }
        static int exp(int a, int b){
            return a^b;
        }

        
        



    }

 }

 delegate int calculate(int x, int y);