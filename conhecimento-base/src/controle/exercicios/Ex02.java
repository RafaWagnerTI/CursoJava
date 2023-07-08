package controle.exercicios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * Criar um programa informa se o ano atual é um ano bissexto;
		 */
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um ano: ");
		int ano = teclado.nextInt();
		boolean verificaAnoBissexto = ano % 4 == 0;
		
		if(verificaAnoBissexto) {
			System.out.println("É bissexto!");
		} else System.out.println("Não é bissexto.");
		
		teclado.close();
	}
}
