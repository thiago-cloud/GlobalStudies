public class CarroImportado {

    String Fabricante;
    String Modelo;
    String Cor;
    int anoDeFabricação;
    boolean BiCombustivel;


    proprietario dono;

    void ligar(){
        if(Modelo == null){
            return;//Ele não vai imprimir na tela o modelo null ele o codigo vai decer naturalmente e vai subir vai retornar sem executar o sysout.
        }
        System.out.println("Ligando o carro: "+Modelo);

    }//Método da classe carro importado ou seja método é uma função que se coloca dentro de uma classe ou seja uma classe deve conter atributos(caracteristicas)
    //é métodos(Comportamento).
    void desligar(){
        System.out.println("Desligando o carro: "+Modelo);
    } //O void e porquê é um método do tipo que não retorna nada.






}
