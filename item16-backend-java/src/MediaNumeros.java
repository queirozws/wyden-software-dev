import java.util.Scanner;

public class MediaNumeros {
	
	public static void main(String args[]) {
		
		Scanner x = new Scanner(System.in);
		   int numero = 0;
		   int somatorio = 0;
		   int qnt = 0;
		   do {
		        System.out.println("Digite um número: ");
		        numero = x.nextInt();
		        if (numero != 0) {
		            if (numero % 2 == 0) {
		                somatorio += numero;
		                qnt++;
		            }
		         }
		     } while (numero != 0);
		     if (qnt != 0)
		         System.out.println("Media = " + (somatorio / qnt));
		     else
		         System.out.println("Nenhum numero par digitado");
		
	}
}
