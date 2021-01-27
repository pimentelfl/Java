import java.util.Scanner;
public class exercicio47 {
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        
        int horainicial, horafim, minutoinicial, minutofim, horatotal, tempoinicio, tempofim, durTotal;

        horainicial = teclado.nextInt();
        minutoinicial = teclado.nextInt();       
        horafim = teclado.nextInt();
        minutofim = teclado.nextInt();

        // coverter tudo para minutos
        tempoinicio = horainicial * 60 + minutoinicial;
        tempofim = horafim * 60 + minutofim;

        durTotal = tempofim - tempoinicio;

       if (durTotal <= 0){
           durTotal = (24 + durTotal) / 60;
           System.out.println("O JOGO DUROU " + durTotal + " HORA (S) E  MINUTO(S)");
       }
       else{
           durTotal = durTotal / 60;
           System.out.println("O JOGO DUROU " + durTotal + " HORA (S)");
       }
        

    }
}