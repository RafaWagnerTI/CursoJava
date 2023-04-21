package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe quantos alunos terá: ");
		int qtdeAlunos = teclado.nextInt();
		
		System.out.println("Informe quantas notas cada aluno terá: ");
		int qtdeNotas = teclado.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for(int a = 0; a < notasDaTurma.length; a++) {
			for(int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a %dª nota do aluno %d: ", n+1, a+1);
				notasDaTurma[a][n] = teclado.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.printf("Média da turma é: %.1f%n", media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		teclado.close();
	}
	
}
