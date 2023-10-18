package pacote.java.excecoes;

public class TesteExcecoes {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);

        cc.depositar(500);
        //cc.depositar(-50);//Nesse caso peremitir que depositemos um valor negativo fica estranho nesse caso temos uma exceção que tem que ser tratada

        try{
            cc.depositar(-20);
        }catch(IllegalArgumentException e){
            System.out.println("Você executou uma operação ilegal: "+e.getMessage());
        }
    }
}
