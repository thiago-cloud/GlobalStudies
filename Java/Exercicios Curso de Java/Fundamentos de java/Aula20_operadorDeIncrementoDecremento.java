


public class Aula20_operadorDeIncrementoDecremento {
    public static void main(String args[]){
        int idade;
        idade = 0;
        

        idade++;
        System.out.println(idade);

        idade+=1;
        System.out.println(idade);

        idade--;
        System.out.println(idade);

        idade-=1;
        System.out.println(idade);

        /* Tomar cuidado o lado que se coloca o incremento se colocar idade++ o ++ no lado direito não vai funcionar o incremento */

        int novaIdade = idade++;
        System.out.println(novaIdade);

        int novaIdade2 = ++idade;
        System.out.println("Nova idade 2: "+novaIdade2);
    }    
}
