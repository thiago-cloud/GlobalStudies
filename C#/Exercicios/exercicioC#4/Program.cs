class program{
    public static void Main(string[] args){

        contaBank conta1 = new contaBank("Renata",2000);
        contaBank conta2 = new contaBank("Jeremias",3000);
        contaBank conta3 = new contaBank("Irineu",5000);
        contaBank conta4 = new contaBank("Carlos",900);
        contaBank conta5 = new contaBank("Luana",1500);

        //Lista
        List<contaBank> contas = new List<contaBank>(){
            conta1,conta2,conta3,conta4,conta5
        };

        //Percorrer lista contas
        foreach(contaBank conta in contas){
                conta.depositar(1000);
                conta.sacar(500);
                Console.WriteLine("Numero da Conta: "+conta.getNumeroConta()+" | Nome: "+conta.getNome()+" | Saldo atual: "+conta.getConsultar()+"\n");
        }
    }
};

class contaBank{
    decimal saldo;
    decimal saldoTotal;
    
    string nome;

    int numeroConta;

     private static int proximoNumeroConta = 1;

    //Constructor
    public contaBank(string nome, decimal saldo){
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = proximoNumeroConta++;
    }

    //getter
    public string getNome(){
        return nome;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public decimal getConsultar(){
        if(saldoTotal<=0){
            return saldo;
        }else{
            return saldoTotal;
        }
    }
    
    //Métodos de depositar é Sacar
    public void depositar(decimal deposito){
        saldoTotal = saldo + deposito;
        Console.WriteLine("Valor do deposito: R$"+deposito);
    }

    public void sacar(decimal saque){
        if(saldoTotal<=0){
            saldo = saldo - saque;
            Console.WriteLine("Valor do saque: R$"+saque);
        }else{
            saldoTotal = saldoTotal - saque;
            Console.WriteLine("Valor do saque: R$"+saque);
        }
    }
}