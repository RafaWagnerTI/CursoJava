package controle.exercicios;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
		 * caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */
		Scanner teclado = new Scanner(System.in);
		double numeroDigitado = 0;
		double somaNumeros = 0;
		while(numeroDigitado > -1) {
			somaNumeros += numeroDigitado;
			System.out.println("Digite um número positivo para continuar a soma: ");
			numeroDigitado = teclado.nextDouble();
		}
		System.out.printf("O resultado da soma é %.2f", somaNumeros);
		teclado.close();
	}
}
