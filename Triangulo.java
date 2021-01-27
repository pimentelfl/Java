import java.util.Scanner;

public class Triangulo{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        double a, b, c;

        System.out.println("Por favor, digite o tamanho da base do triangulo");
        a = teclado.nextDouble();

        System.out.println("Por favor, digite o tamanho da altura do triangulo");
        b = teclado.nextDouble();

        c = a * b /2;

        System.out.println("A area do triangulo e: " + c);
    }
}