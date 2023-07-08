package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota = 0.0;
		double somaNotas = 0.0;
		int qtdeNotas = 0;
		
		while(nota != -1) {
			System.out.println("Digite a nota do aluno ou -1 para sair: ");
			nota = teclado.nextDouble();
			if(nota >= 0.0 && nota <= 10.0 ) {
				somaNotas += nota;
				qtdeNotas++;
			} else if(nota != -1) System.out.println("Nota inválida!");
		}
		
		double media = somaNotas/(qtdeNotas == 0 ? 1 : qtdeNotas);
		
		System.out.printf("A média da classe é %.1f", media);
		
		teclado.close();
	}
}
