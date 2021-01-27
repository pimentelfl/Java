import java.util.Scanner;
public class exercicio17{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        
        int distancia, velocidade;
        double consumo;
        
        distancia = teclado.nextInt();
        velocidade = teclado.nextInt();
              
        consumo = (velocidade / 12.000) * distancia;
        
        System.out.printf("%.3f\n" , consumo);
    }
}