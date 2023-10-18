public class Paciente {

    String nome;
    double peso;
    double altura;

    double calcularImcPaciente() {
        imc IMC = new imc();

        double valor = peso / (altura * altura);


        if (valor < 18) {
            IMC.abaixoDoPeso = true;
        } else if (valor >= 18.5 && valor <= 24.9) {
            IMC.pesoIdeal = true;
        } else {
            IMC.obeso = true;
            if (valor > 30) {
                IMC.grauObesidade = "Acima do peso";
            } else if (valor > 30 && valor < 34.9) {
                IMC.grauObesidade = "I";
            } else if (valor >= 35 && valor < 34.9) {
                IMC.grauObesidade = "II";
            } else {
                IMC.grauObesidade = "III";
            }
        }


        return valor;
    }

    imc attImc;
}



