package controle.exercicios;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número");
		int numero = teclado.nextInt();
		boolean verificaNumeroPar = numero %2 == 0;
		boolean verificaNumeroValido = numero >= 0 && numero <= 10;
		if(verificaNumeroValido && verificaNumeroPar) {
			System.out.println("Número Válido");
		} else System.out.println("Número Inválido");
		teclado.close();
	}
}
