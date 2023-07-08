package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		 */
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: ").replace(",", "."));
		double valor2 = Math.pow(valor, 2);
		double valor3 = Math.pow(valor, 3);
		
		System.out.printf("O valor %.2f² é %.2f.%nO valor %.2f³ é %.2f", valor, valor2, valor, valor3);
	}
}
