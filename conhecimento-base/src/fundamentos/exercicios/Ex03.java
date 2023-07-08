package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		 */ 
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: ").replace(",", "."));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: ").replace(",", "."));	
		double IMC = peso / (Math.pow(altura, 2));
		
		System.out.printf("O seu IMC é %.2f", IMC);
	}
}
