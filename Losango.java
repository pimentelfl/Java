import java.util.Scanner;

public class Losango{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        double a, b, c;

        System.out.println("Por favor, digite o tamanho da diagonal 1 do losango");
        a = teclado.nextDouble();

        System.out.println("Por favor, digite o tamanho da diagonal 2 do losango");
        b = teclado.nextDouble();

        c = a * b;

        System.out.println("A area do losango e: " + c);
    }
}