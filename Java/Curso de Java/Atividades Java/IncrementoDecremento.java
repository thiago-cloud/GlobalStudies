public class IncrementoDecremento{
    public static void main(String[] args){
        int idade = 10;
        System.out.println(idade);
        idade++;// isso e mesma coisa de somar mais um a o valor da variavel idade (idade=idade + 1)
        System.out.println(idade);
        //int novaIdade = idade++;//Nesse caso ele não incrementa porque ele pega primeiro a idade que vale 11 e coloca na variavel novaIdade so depois que ele ver ++
        //System.out.println(novaIdade);

        int novaIdade = ++idade; //Nesse caso como o incremento ta na frente ele soma mais e aramazena na variavel novaIdade
        System.out.println(novaIdade);
    }

}