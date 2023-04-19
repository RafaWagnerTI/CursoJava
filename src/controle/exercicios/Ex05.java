package controle.exercicios;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/* Refatorar o exercício 04, utilizando a estrutura switch. */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		int totalNumerosDivisivel = 1;
		
		for(int i = 2; i <= numero; i++)
			if(numero % i == 0) {
				totalNumerosDivisivel++;
				if(totalNumerosDivisivel > 2) 
					break;
			}
		
		switch(totalNumerosDivisivel) {
			case 2: System.out.println("É primo!"); break;
			default: System.out.println("Não é primo!"); break;
		}
		
		teclado.close();
	}
}
