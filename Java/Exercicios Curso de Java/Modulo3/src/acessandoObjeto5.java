import java.sql.SQLOutput;

public class acessandoObjeto5 {
    public static void main(String[] args) {
        folhaDePagamento pagamento = new folhaDePagamento();

        double total = pagamento.calcularSalario(20, 10,5,15);
        System.out.println("O seu pagamento total vai ser igual: "+total);
    }


}
