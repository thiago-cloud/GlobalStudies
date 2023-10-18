public class Array {
    public static void main(String[] args) {
        /*int[] Notas;//Decrando uma array chamanda notas
        Notas = new int[5];//Declaramos que a array Notas tera o tamnho de 5 indices;

       int[] Notas1 = new int[5];

        Notas1[0] = 10;
        Notas1[1] = 3;
        Notas1[2] = 7;
        Notas1[3] = 8;
        Notas1[4] = 6;

        for (int i = 0; i<Notas1.length ; i++){
            System.out.println(" Notas do aluno na posição ["+i+"] "+Notas1[i]);

            System.out.println("   ");*/

        //Array que os indices aponta para objetos

        Carro[] carro = new Carro[3];//Classe Carro

        carro[0] = new Carro();//Referencia um objeto para cada indice
        carro[1] = new Carro();
        carro[2] = new Carro();



        carro[0].Modelo = "Corola";
        carro[0].Cor = "Branco";
        carro[0].ano = 2015;
        carro[0].Fabricante = "Toyota";

        carro[1].Modelo = "Gol g5";
        carro[1].Cor = "Vermelho";
        carro[1].ano = 2020;
        carro[1].Fabricante = "Volkswagen";

        carro[2].Modelo = "Palio";
        carro[2].Cor = "Preto";
        carro[2].ano = 2001;
        carro[2].Fabricante = "Fiat";





        for(int c = 0; c < carro.length ; c++){
            System.out.println("Modelo: "+carro[c].Modelo);
            System.out.println("Cor: "+carro[c].Cor);
            System.out.println("ano: "+carro[c].ano);
            System.out.println("Fabricante: "+carro[c].Fabricante);
        }



        }




    }



//Além disso dentro do array podemos colocar referencias de objetos em cada indice