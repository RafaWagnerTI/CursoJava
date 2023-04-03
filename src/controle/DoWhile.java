package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String resposta = "sim";
		
		do {
			System.out.println("Quer sair? ");
			resposta = teclado.nextLine();
		} while(!resposta.equalsIgnoreCase("sim"));
		
		System.out.println("Até mais!");
		
		teclado.close();
	}
}
