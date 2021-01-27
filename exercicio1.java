import java.util.Scanner;
public class exercicio1{
    public static void main(String args []){
        Scanner teclado = new Sacnner(System.in);
        
        int peca1codigo, peca2codigo, peca1numero, peca2numero;
        Double peca1valor, peca2valor, valorapagar;
        
        peca1codigo = teclado.nextInt();
        peca1numero = teclado.nextInt();
        peca1valor = teclado.nextDouble();
        peca2codigo = teclado.nextInt();
        peca2numero = teclado.nextInt();
        peca2valor = teclado.nextDouble();
        
        valorapagar = (peca1numero*peca1valor) + (peca2numero*peca2valor);
        
        System.out.printf("VALOR A PAGAR : R$ %.2f\n" , valorapagar);
    }
}