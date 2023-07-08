package controle.exercicios;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que receba um número e diga se ele é um número primo.
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = teclado.nextInt();
		boolean numeroDivisivelPorOutros = false;
		
		if(numero > 1) {
			for(int i = 2; i <= numero; i++)
				if(numero % i == 0 && numero != i ) {
					numeroDivisivelPorOutros = true;
					System.out.println("Não é primo");
					break;
				}
		
			if(!numeroDivisivelPorOutros) {
				System.out.println("É primo");
			}
			
		} else System.out.println("Não é primo");
		
		teclado.close();
	}
}
