public class acessandoObjetos3 {

    public static void main(String[] args) {
        CarroImportado carro1 = new CarroImportado();
        carro1.Modelo = "BMW";
        carro1.Cor = "Prata";
        carro1.anoDeFabricação = 2022;

        CarroImportado carro2 = new CarroImportado();
        carro2.Modelo = "Mercedes Benz";
        carro2.Cor = "Branco";
        carro2.anoDeFabricação = 2020;

        CarroImportado carro3 = new CarroImportado();
        carro3.Modelo = "Ferrari";
        carro3.Cor = "Vermelho";
        carro3.anoDeFabricação = 2022;

        CarroImportado carro4 = new CarroImportado();
        carro4.Modelo = "Camaro";
        carro4.Cor = "Amarelo";
        carro4.anoDeFabricação = 2019;


        //Chamando o método da classe carroImportado
        carro1.ligar();
        carro2.ligar();
        carro3.ligar();
        carro4.ligar();

        carro1.desligar();
    }



}
