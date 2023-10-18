public class atribuindoArcondicionado {
    public static void main(String[] args) {
        arcondicionado eletro = new arcondicionado();


        //eletro.Temperatura = 20; Não é possuvel atribuir um valor mais a esse atributo temperatura pois ele estar encapsulado com o private. so podemos atribuir atravês
        //do método

        eletro.trocarTemperatura(18);



        System.out.println("Temperatura do ar: "+eletro.obterTemperatura());
        System.out.println("Temperatura do ar 2: "+eletro.obterTemperatura());


    }
}
