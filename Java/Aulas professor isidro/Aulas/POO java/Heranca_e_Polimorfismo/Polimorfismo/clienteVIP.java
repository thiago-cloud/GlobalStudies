package Heranca_e_Polimorfismo.Polimorfismo;

public class clienteVIP extends cliente {

    float creditoExtra;

    public clienteVIP(String nome,String email, float creditoExtra, float credito){
        super(nome, email, credito);
        this.creditoExtra = creditoExtra;
    }
    
    public String toString(){
        return "(VIP)"+super.toString()+" Credito Extra R$ "+creditoExtra;
    }

     





}
