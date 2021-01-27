import java.util.Scanner;
public class exercicio48 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, novosalario, reajuste, percentual;

        salario = teclado.nextDouble();

        if (salario <= 400.00){
            reajuste = (salario * 0.15);
            novosalario = (salario + reajuste);
            System.out.printf("Novo Salario: %.2f\n" , novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if (salario > 400.00 && salario <= 800.00){
            reajuste = (salario * 0.12);
            novosalario = (salario + reajuste);
            System.out.printf("Novo Salario: %.2f\n" , novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 12 %");
        }
         else if (salario > 800.00 && salario <= 1200.00){
            reajuste = (salario * 0.10);
            novosalario = (salario + reajuste);
            System.out.printf("Novo Salario: %.2f\n" , novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 10 %");
        }
            else if (salario > 1200.00 && salario <= 2000.00){
            reajuste = (salario * 0.07);
            novosalario = (salario + reajuste);
            System.out.printf("Novo Salario: %.2f\n" , novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 7 %");
        }
            else {
            reajuste = (salario * 0.04);
            novosalario = (salario + reajuste);
            System.out.printf("Novo Salario: %.2f\n" , novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println("Em percentual: 4 %");
        }
    }
}