package controle.exercicios;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que receba duas notas parciais, calcular a média final. 
		 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for 
		 * menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime 
		 * no console "Reprovado".
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite as duas notas do aluno");
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media >= 7.0)
			System.out.println("Aprovado");
		else if(media >= 4.0)
			System.out.println("Recuperação");
		else System.out.println("Reprovado");
		
		teclado.close();
	}
}
