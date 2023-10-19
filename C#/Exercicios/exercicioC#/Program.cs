// See https://aka.ms/new-console-template for more information
//Console.WriteLine("Hello, World!");

class program{


    public static void Main(string[] args){

        contaBanco user1 = new contaBanco("Jurubeba",2000);
        /*user1.depositar(2000);
        user1.depositar(0);
        user1.sacar(1000);
        user1.consultar();
        user1.sacar(500);
        user1.depositar(5000);*/
        user1.consultar();
        user1.sacar(2000);
        user1.sacar(1000);
        user1.depositar(10000);
        

    }

}

class contaBanco{
    decimal saldo;
    decimal saldoTotal;
    string titular;
    

    public contaBanco(string titular,decimal saldo){
        this.saldo = saldo;
        this.titular = titular;
        

    }


    public void consultar(){
            if(saldoTotal == 0){
                saldoTotal = saldo;
                 Console.WriteLine("O seu saldo total é R$: "+saldoTotal+"\n\n\n");
                
            }else{
                Console.WriteLine("O seu saldo total é R$: "+saldoTotal+"\n\n\n");
            }
        }
    

    public void depositar(decimal deposito){
        if(deposito <= 0){
            Console.WriteLine("Não foi possivel realizar o deposito!");
            Console.WriteLine("É necessario o deposito ter no minimo o valor de 1,00 real\n\n\n");
            return;
        }
        saldoTotal = saldo + deposito;
        Console.WriteLine("Deposito Realizado com Sucesso!");
        Console.WriteLine("Deposito R$: "+deposito);
        Console.WriteLine("saldoTotal R$: "+saldoTotal+"\n\n\n");
    }

    public void sacar(decimal saque){
        if(saldo <= 0 ){
            Console.WriteLine("Não foi possivel Realizar pois não a saldo suficiente");
            Console.WriteLine("Saldo R$: "+saldoTotal);
            return;
        }else{
        saldoTotal = saldo - saque;
        Console.WriteLine("Saque feito com Sucesso!");
        Console.WriteLine("Saldo R$: "+saldoTotal);
        Console.WriteLine("Saque R$: "+saque+"\n\n\n");
        }
    }

}






