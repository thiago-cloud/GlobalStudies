public class folhaDePagamento {

    double calcularSalario(int horasNormais, int horasExtras, double valorNormais, double valorExtras){
        double calcularNormais = horasNormais * valorNormais;
        double calcularExtras = horasExtras * valorExtras;

        double totalHoras = calcularNormais + calcularExtras;

        return totalHoras;
    }

}


