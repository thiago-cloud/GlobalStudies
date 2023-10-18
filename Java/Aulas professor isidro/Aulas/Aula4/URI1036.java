
import java.util.Scanner;
public class URI1036 {
    public static void main(String args[]){
    
        //ax^2+bx+c=0
        //delta = b^2-4*a*c
        //x=-b +- raiz.delta/2*a

    Scanner input = new Scanner(System.in);
    double a,b,c,x1,x2;
    double delta;    

    System.out.println("Informe o primeiro valor: ");
    a = input.nextDouble();

    System.out.println("Informe o segundo valor: ");
    b = input.nextDouble();

    System.out.println("Informe o terceiro valor: ");
    c = input.nextDouble();

    delta = Math.pow(b,2) - 4*a*c;

    if(delta == 0){
        System.out.println("Não foi possivel continuar pois delta é: "+delta);
    }else if(delta<0){
        System.out.println("Não foi possivel continuar pois delta e negativo: "+delta);
    }else{
        x1 = (-b + Math.sqrt(delta))/2*a;
    
        x2 = (-b - Math.sqrt(delta))/2*a;
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        }

    }
}
