package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String resposta = "";
		while(!resposta.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			resposta = teclado.nextLine();
		}
		
		teclado.close();
	}
}
