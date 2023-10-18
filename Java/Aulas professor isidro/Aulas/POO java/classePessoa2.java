import java.util.Scanner;

public class classePessoa2 {
    
    public String nome;
    public String sobrenome;
    public int idade;
    public double peso;
    public double altura;
    public double media = 0d;


    public void cadastrarPessoa(){
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Informe seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Informe o seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();
    }

    public void calcularMedia(){
        Scanner entrada = new Scanner(System.in);
        double nota = 0d;
        
        double total = 0d;
        int qtdMaterias = 0;
        int cont = 1;

        System.out.println("Informe a quantidade de materias: ");
        qtdMaterias = entrada.nextInt();

        while(cont<=qtdMaterias){
            System.out.println("Informe sua "+cont+"ª nota: ");
            nota = entrada.nextDouble();
            total+=nota;
            cont++;
        }
        media = (total)/qtdMaterias;
         System.out.println("Sua media é igual a: "+media);
    }

    public void verificacao(){

        if( media <= 7){
            System.out.println("Reprovado!");
        }else if(media>=7 && media<=10){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Valor desconhecido!");
        }
    }

}
