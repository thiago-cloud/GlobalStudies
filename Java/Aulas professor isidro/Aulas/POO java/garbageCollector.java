public class garbageCollector{
    public static void main(String args[]){
        String s1 = new String("Opa amigo");// Quando colocamos new a maquina virtual ja entende como novo objeto
        String s2 = new String("Opa amigo");
        

        if(s1==s2){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }

        System.out.println("hashcode do s1: "+s1.hashCode());
        System.out.println("hashcode do s2: "+s2.hashCode());

        String s3 = "Opa Irineu";
        String s4 = "Opa Irineu";




        System.out.println("s3 e igual ao s4: "+s3.equals(s4));
        System.out.println("hashcode do s3: "+s3.hashCode());
        System.out.println("hashcode do s4: "+s4.hashCode());



    }
}