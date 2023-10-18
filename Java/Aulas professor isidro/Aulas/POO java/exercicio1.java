public class exercicio1 {
    public static void main(String args[]){

        String p1 = new String("Boa noite amigo");
        String p2 = new String("Boa noite amigo");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        
        classPessoa p4 = new classPessoa(25,"Jirino","Silva");
        classPessoa p5 = new classPessoa(25,"jurubeba","rubens");

        System.out.println("Hashcode do p4: "+p4.hashCode());
        System.out.println("Hashcode do p5: "+p5.hashCode());


    }
    
}
