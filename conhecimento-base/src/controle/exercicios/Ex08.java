package controle.exercicios;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que receba uma palavra e imprime no console letra por letra.
		 */
		Scanner teclado = new Scanner(System.in);
		String palavra = "";
		System.out.println("Digite uma palavra, para ser soletrada: ");
		palavra = teclado.nextLine();
		for(int i = 0; i < palavra.length() ; i++) {
			System.out.println(palavra.charAt(i));
		}
		teclado.close();
	}
}
