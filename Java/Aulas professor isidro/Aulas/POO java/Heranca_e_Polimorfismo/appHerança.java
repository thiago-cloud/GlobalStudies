package Heranca_e_Polimorfismo;

public class appHerança {
    public static void main(String args[]){
        
        /*Método setters 
        pessoa p1 = new pessoa();

        p1.setNome("Irineu");
        p1.setEmail("irineu123@gmail.com");

        
        funcionario f1 = new funcionario();

        f1.setNome("Jurubeba");
        f1.setEmail("jurubeba555@gmail.com");
        f1.setSalario(5000);

        System.out.println("Mostrando informações na tela!");
        System.out.println("Funcionarios: ");
        System.out.println("Nome: "+f1.getNome());
        System.out.println("Email: "+f1.getEmail());
        System.out.println("Salario: "+f1.getSalario());
        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println(" ");
        System.out.println("Pessoas: ");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Email: "+p1.getNome());
*/
//Método Construtor

funcionario f2 = new funcionario("Firmindo", "firmindosilva@gmail.com", 5000);

System.out.println("Nome: "+f2.getNome());
System.out.println("Email: "+f2.getEmail());
System.out.println("Salario: "+f2.getSalario());



        
    }
}
