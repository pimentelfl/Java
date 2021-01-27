import java.util.Scanner;

public class Area_quadrado {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, b;

        System.out.println("Por favor, digite o tamanho do lado quadrado");
        a = teclado.nextFloat();

        b = a * a;

        System.out.println("A area do quadrado e: " + b);

    }

}
