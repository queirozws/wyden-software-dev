import java.util.Scanner;

public class Fatorial {
	

	public static void main(String args[]) {
		
		System.out.println("Inserir valor para obter fatorial.");
		   
		Scanner valor = new Scanner(System.in);// instaciando a classe responsável por acessar o buffer do teclado
	
	    
	    int valorDigitado = valor.nextInt(); // variável que recebe o valor recebido via teclado e muda o tipo para inteiro
	    int valorFatorial = 1;
	    
	    for(int i = 1; i <= valorDigitado; i++) { //laço para a interaçao das variáveis obtendo como resultado o valor do fatorial
	    	valorFatorial = valorFatorial*i;
	    }
	    System.out.println("\n"+valorFatorial);
	}

  }
