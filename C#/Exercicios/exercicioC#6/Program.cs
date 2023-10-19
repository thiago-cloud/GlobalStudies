class program{
    public static void Main(string[] args){

        calculo calc = new calculo(soma);
        calculo calc1 = new calculo(subtrair);
        calculo calc2 = new calculo(multiplicar);
        calculo calc3 = new calculo(div);
        calculo calc4 = new calculo(exp);
        
        Console.WriteLine(calc(5,5));
        Console.WriteLine(calc1(10,8));
        Console.WriteLine(calc2(10,10));
        Console.WriteLine(calc3(50,2));
        Console.WriteLine(calc4(10,5));
        
        static int soma(int a , int b){
            return a+b;
        }
        static int subtrair(int a, int b){
            return a-b;
        }
        static int multiplicar(int a, int b){
            return a*b;
        }
        static int div(int a, int b){
            return a/b;
        }
        static int exp(int a, int b){
            return a^b;
        }
    }





}


delegate int calculo(int x, int y);