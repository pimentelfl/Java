import java.util.Scanner;
public class exercicio41{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        double x, y, resultado;

        x = teclado.nextDouble();
        y = teclado.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x != 0 && y == 0){
            System.out.println("Eixo X");
        }
        else if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
        else {
            System.out.println("Origem");
        }
    }
}