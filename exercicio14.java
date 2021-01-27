import java.util.Scanner;
public class exercicio14{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        
        int distancia;
        double consumo, media;
        
        distancia = teclado.nextInt();
        consumo = teclado.nextDouble();
              
        media = distancia / consumo;
        
        System.out.printf("%.3f km/l\n" , media);
    }
}