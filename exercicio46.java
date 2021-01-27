import java.util.Scanner;
public class exercicio46 {
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        
        int inicio, fim, total;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

       if (fim < inicio){
           total = 24 - (inicio - fim);
           System.out.println("O JOGO DUROU " + total + " HORA (S)");
       }
       else{
           total = fim - inicio;
           System.out.println("O JOGO DUROU " + total + " HORA (S)");
       }
        

    }
}