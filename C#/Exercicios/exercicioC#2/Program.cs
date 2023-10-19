// See https://aka.ms/new-console-template for more information


class program{
    public static void Main(){

        contaBanco user1 = new contaBanco();//Objeto instanciado

        user1.Saldo = 500;//Método set 
        Console.WriteLine(user1.Saldo);//Método get
        

    }

}


class contaBanco{

    private string nome;
    private decimal saldo;

    //Novas propriedades do C# métodos get e set
    public decimal Saldo{
        get{ return saldo; }
        set{ saldo = value; }
    }


}






