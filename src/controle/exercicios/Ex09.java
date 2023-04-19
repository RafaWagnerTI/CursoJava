package controle.exercicios;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que recebe 10 valores e ao final imprima o maior número. 
		 */
		Scanner teclado = new Scanner(System.in);
		int numeroDigitado;
		int maiorNumero = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numeroDigitado = teclado.nextInt();
			
			if(numeroDigitado > maiorNumero)
				maiorNumero = numeroDigitado;
		}
		
		System.out.printf("O maior número digitado é: %d", maiorNumero);
		
		teclado.close();
	}
}
