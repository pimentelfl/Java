import java.util.Scanner;

public class Retangulo {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double a, b, c;

        System.out.println("Por favor, digite o tamanho da base do retangulo");
        a = teclado.nextDouble();

        System.out.println("Por favor, digite o tamanho da altura do retangulo");
        b = teclado.nextDouble();

        c = a * b;

        System.out.println("A area do retangulo e: " + c);

    }
        
}