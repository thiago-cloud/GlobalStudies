

class executar{

    public static void Main(){

        contaBank conta1 = new contaBank("Jurubeba",2000);
        contaBank conta2 = new contaBank("irineu",100);

        //Console.WriteLine(conta1.getNome());
        //Console.WriteLine(conta1.getSaldo());
        //conta2.setSaldo(2000);
        //Console.WriteLine(conta2.getSaldo());

        List<contaBank> contas = new List<contaBank>(){
            conta1,conta2
        };

        Lista<string> nomes = new Lista<string>();
            nomes.Value = "joao"; 
            Console.WriteLine(nomes.Value.Length);
        
       


        foreach (contaBank c in contas){
            Console.WriteLine(c.getNome());
        }
        
    }
    

}
    class Lista<T>{
            public T Value { get; set; }
        }



public class contaBank{
    string nome;
    decimal saldo;


    public contaBank(string nome, decimal saldo){
        this.nome = nome;
        this.saldo = saldo;

    }

    public string getNome(){
        return nome;
    }

    public decimal getSaldo(){
        return saldo;
    }
    public void setNome(string nome){
        this.nome = nome;
    }
    public void setSaldo(decimal saldo){
        this.saldo = saldo;
    }
    

}