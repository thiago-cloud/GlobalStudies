package Heranca_e_Polimorfismo.Polimorfismo;



public class lojasAmericanas{
    public static void main(String args[]){
        cliente c1,c2;//Polimorfismo
        

        c1 = new cliente("jurubeba", "jurubeba@gmail.com", 500);
        c2 = new clienteVIP("irineu","irineu@gmail.com",1000,2000);//Cliente vip também é um cliente

        System.out.println(c1.getNome());
       

    }
}