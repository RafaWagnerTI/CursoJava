package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe quantas notas quer digitar: ");
		int qtdeNotas = teclado.nextInt();
		
		double[] notasAluno = new double[qtdeNotas];
		double somaNotasAluno = 0.0;
		
		for(int i = 0; i < notasAluno.length ; i++) { 
			System.out.printf("Informe a %dª nota do aluno: ", i + 1);
			notasAluno[i] = teclado.nextDouble();
		}
		
		for(double nota : notasAluno)
			somaNotasAluno += nota;
		
		System.out.printf("%nA média do aluno é: %.2f", somaNotasAluno / notasAluno.length);
		
		teclado.close();
	}
	
}
