// See https://aka.ms/new-console-template for more information
/*Console.WriteLine("Hello, World!");
Console.WriteLine("Aprendendo c#");

//Variavel string
string nome,sobrenome;

nome = "jurubeba";

Console.WriteLine(nome);

//Variavel inteira

int i;
int i1 = 10;
int i2 = i = 20;

Console.WriteLine(i);
Console.WriteLine(i1);


//Operado ternario

string ter;
ter = i1 == 10 ? "É 10" : "Não é 10";
Console.WriteLine(ter);*/
/*
Console.Write("Informe seu nome: ");
string nome = Console.ReadLine();
Console.WriteLine(nome);
Console.WriteLine($"Olá {nome}!");//Concatenação de string
Console.WriteLine("Digite o ano de seu nascimento: ");
int ano = int.Parse(Console.ReadLine());//Como o console.readLine e do tipo string nos colocamos int.parse para converter para o tipo int
Console.WriteLine("Você nasceu em "+ano);
*/

/*
Console.Write("Informe seu nome: ");
string nome = Console.ReadLine();
Console.Write("Informe o ano que voce nasceu: ");
int ano = int.Parse(Console.ReadLine());
int idade = 2023 - ano;
Console.WriteLine("Seu nome é: "+nome+" é você tem "+idade+" anos de idade");

if(idade >= 18){
    Console.WriteLine("Você é maior de idade");
}else if(idade<=18){
    Console.WriteLine("Você não é maior de idade ");
}else{
    Console.WriteLine("Por favor insirar um valor adequado para cada pergunta!");
}

*/
//------------------------------------------------------------------------------------------------


/*
string valor = "Sim";
while(valor == "Sim"){

Console.WriteLine("Informe suas nota: ");
Console.WriteLine("Informe a nota de Gramatica: ");
float Gramatica = float.Parse(Console.ReadLine());
Console.WriteLine("Informe a nota de Matemática: ");
float Matematica = float.Parse(Console.ReadLine());
Console.WriteLine("Informe sua nota de Quimica: ");
float Quimica = float.Parse(Console.ReadLine());
Console.WriteLine("Informe sua nota de Física: ");
float Fisica = float.Parse(Console.ReadLine());

float media = (Gramatica+Matematica+Quimica+Fisica)/4;

Console.WriteLine("O Resultado da média é: "+media);

if(media >= 7 && media < 8 ){
    Console.WriteLine("Aprovado por média!");
}else if(media >= 8 && media < 9){
    Console.WriteLine("Aprovado sua média foi boa!");
}else if(media>=9 && media<=10){
    Console.WriteLine("Aprovado exelente nota!");
}else if(media<7 ){
    Console.WriteLine("Reprovado");
}else{
    Console.WriteLine("Valor desconhecido!");
    }
Console.WriteLine("Deseja iniciar Novamente? Digite Sim ou Não");
valor = Console.ReadLine();
    
    

}*/


/*
//Array

string[] nome = {"irineu","jurubeba"};
for(int i = 0; i<nome.Length ; i++){
    Console.WriteLine(nome[i]);
}


string[] animais = {"gato","cachorro","girafa"};

foreach (var bixo in animais)
{
    Console.WriteLine(bixo);
}*/

/*
class Program{

    public static void Main(string[] Args){
        Console.WriteLine("JOB");

        string[] nomes = {"Jurubeba","Irineu","Ernando"};

        //Compara os dois nomes jurubeba e Jurubeba e ignora o caseSensitive
        if(string.Equals(nomes[0],"jurubeba",StringComparison.OrdinalIgnoreCase)){
            Console.Write("Strings iguais");
        };


    }
}

*/

/*
class program{
    
    static void Main(){
    string beta = "";
    string betaComSpace = " ";
    string nome = "José Aldo";
    string[] arrayNomes = {"Irineu","Marlene","Jurubeba"};
    Console.WriteLine(nome.Length);
    Console.WriteLine(nome.EndsWith("o"));//Vai retorna true se tiver uma string o no final da variavel nome
    Console.WriteLine(nome.StartsWith("J"));//Vai retorna true se tiver uma string J no começo da variavel nome
    Console.WriteLine(nome.Contains('l'));//Vai retorna true se conter o caractere l
    Console.WriteLine(nome.IndexOf("A"));//Vai retorna a posição da letra A ou seja o indice
    Console.WriteLine(string.IsNullOrEmpty(nome));//Retorna true se a string for nula ou vazia
    Console.WriteLine(string.IsNullOrEmpty(beta));//Serve para fazer validações de string
    Console.WriteLine(string.IsNullOrWhiteSpace(betaComSpace));//A diferença desse para o outro eq que aki identifica o espaço e quando tem espaço ele retorna True dizendo que estar vazio
    Console.WriteLine(string.Join('-',arrayNomes));//Retornar uma unica string incluindo um separador que separa os elementos do array
    
    Console.WriteLine(int.MaxValue);//Retorna o maior valor que um variavel do tipo int pode suportar
    Console.WriteLine(int.MinValue);//Retorna o menor valor que um variavel do tipo int pode suportar

    int i = 50;
    Console.WriteLine(i);
    int.TryParse("60",out i );//O tryParse tem papel de substituir uma valor de uma variavel int por outra ou seja ele tenta fazer de um numero para uma string
    Console.WriteLine(i);



    long longo = 10000000000000000;
    int inteiroo = 10;

    //longo = inteiroo;//No c# Não é possivel armazenar uma variavel de u, tipo em outra variavel de outro tipo de forma implicita

    inteiroo = (int)longo;//Convertendo o valor de long para um inteiro de forma correta

    Console.WriteLine(inteiroo);

    string s = longo.ToString();

    Console.WriteLine("Convertendo long em tipo string: "+s);
    }
}
*/
//------------------------------------------------------------------------------------------------------------------------

//Inicializando uma classe

/*
class personagem{

public static void Main(){
    inimigoIA teste = new inimigoIA();

    teste.correr();


    int? i = 50;//O interrogação serve para dizer que o valor e anulavel ou seja ele pode ser int ou null 
    i = null;
    Console.WriteLine(i.GetValueOrDefault(20));//Caso o valor seja nulo do i substituimos valor nulo por 20


    if(i == null){
        Console.WriteLine("Nulo!");
    }else{
        Console.WriteLine("Não Nulo!");
    }
    


}

}

class inimigoIA{

    public void correr(){
       int passos = 1 + 1;
    }






}
*/

/*
class program{
    public static void Main(){
        string s = null;
        //NullReferenceException
        //Como o valor da string s e nulo sera apresentado um erro feio na tela que podemos tratar com tryCatch 
        


        //try vai verificar se o bloco de ação ta causando um de exception
        //O catch captura o exceptio e aciona um codigo em relação a isso no caso aki o console
        try{
            Console.WriteLine(s.Length);
        }catch(System.Exception){
            Console.WriteLine("Erro");
        }

        //ou

        //e é um parametro no lugar dele pode ser qualquer declaração, geralmente utilizamos o parametro aliado ao StackTrace quando queremos mostrar também a messagem abrupta do estouro de erro
        string s1 = null;

        try{
            Console.WriteLine(s1.Length);
        }catch(System.NullReferenceException e){
            Console.WriteLine($"Erro de referencia nula: {e.StackTrace}");
        }

        //Ex2:
        string[] nomes = {"irene","irineu","joana","jimping"};


        
        try{
            Console.WriteLine(nomes[4]);
        }catch(System.IndexOutOfRangeException excep){
            Console.WriteLine("ERRO 2: "+excep.StackTrace);
        }

        string[] animais = {"Jabuti","Vaca","Cachorro"};

        try{
            Console.WriteLine(animais[10]);
        }catch(System.Exception teste){
            Console.WriteLine("Erro 3: "+teste.StackTrace);
        }


    }
}*/

/*

using System.Reflection.Emit;
using System.Security.Cryptography.X509Certificates;
using System.Xml.Schema;


class program{

    public static void Main(){

        ContaBank conta = new ContaBank("irineu",205);

        Console.WriteLine(conta);

        conta.depositar(0);

        Console.Write(conta.getSaldoTotal());


    }
}


class ContaBank{
    string nome;
    decimal saldo;
    decimal saldoTotal;


    //Construtor
    public ContaBank(string nome, decimal saldo){
        this.nome = nome;
        this.saldo = saldo;
        
        //O throw e uma tratativa de erro
        if(string.IsNullOrWhiteSpace(nome)){
            throw new Exception("Nome inválido."+nameof(nome));//O nameof e uma boa pratica por causa altere a declaração nome todas as declarações nome serão alteradas automaticamente para alterar tudo automaticamente click + f2
        }

        if(saldo < 0){
            throw new Exception("Saldo não pode ser negativo.");
        }

    }

    public void depositar(decimal deposito){
        if(deposito<=0){
            Console.WriteLine("Deposito não pode ser menor ou igual a 0");
            return;
        }
        saldoTotal = saldo + deposito;
    }
    public decimal getSaldoTotal(){
        return saldoTotal;
    }



}
    */


/*
class program{

    public static void Main(){
        Carro car1 = new Carro("HB20 ","Hyundai","Preto",2020);

        car1.tempoUtil(2020);
        
        
    }

}

class Carro{
   public string cor;
    string modelo;
    string fabricante;
    int ano;
    int idadeCarro;
    int dataAtual = 2023;

    public Carro(string modelo,string fabricante, string cor,int ano){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;

        if(string.IsNullOrWhiteSpace(modelo)){
            throw new Exception("Modelo inválido ");
        }
        if(string.IsNullOrWhiteSpace(fabricante)){
            throw new Exception("Fabricante inválido ");
        }
    }

    public void tempoUtil(int ano){

        idadeCarro = dataAtual - ano;
    }

}   
*/


//------------------------------------------------------
//Get Set

public class main{
    public static void Main(string[] args){
        


        consoleLogger log = new FileLogger();
        contaBank conta = new contaBank("irineu",5000,log);
        conta.Saldo = 0;
        conta.Saldo = -10;
        
        Console.WriteLine(conta.Saldo);

    }
}
class contaBank{
    string nome;
    decimal saldo;
    private readonly ILogger logger;

    //Construtor
    public contaBank(string nome, decimal saldo, ILogger logger){

        this.nome = nome;
        this.saldo = saldo;
        this.logger = logger;

    }

    //Propriedades
    public Decimal Saldo{
        get{ 
            if(saldo<= 0){
                logger.Log($"O Valor {saldo} não pode ser menor ou igual a 0");
                return saldo;
            }
            return saldo; 
        }
        set{ 
            if(saldo<= 0){
                logger.Log($"O Valor {saldo} não pode ser menor ou igual a 0");
                return;
            }
            
            saldo = value;
         }
    }

}

//classe consoleLogger do tipo ILogger
class consoleLogger : ILogger{
    public void Log(string message){
        Console.WriteLine($"Log: {message}");
    }

    public static implicit operator consoleLogger(FileLogger v)
    {
        
        throw new NotImplementedException("La no ceu tem pão ");
    }
}

//Interface
interface ILogger{
    void Log(string message);
}

class FileLogger : ILogger{
    public void Log(string message){
        File.AppendAllText("log.txt", $"{message}{Environment.NewLine}");
    }
}



/*

public class program1{
    public static void Main(string[] args){
        abastecer encher = new abastecer();

        encher.tanque = 0;
        Console.WriteLine(encher.tanque);

    }
}


public class abastecer{

    double abastecerTanque;


    public double tanque{

        get { return abastecerTanque; }
        set { 
            if(abastecerTanque <= 0){
                Console.WriteLine("Valor não pode ser menor ou igual a 0");
                
            }
            
            abastecerTanque = value; }

    }


}

*/
//------------------------------------------------------------------------




















