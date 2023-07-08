package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		 */
		double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: ").replace(",", "."));;
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo: ").replace(",", "."));
		double area = (base*altura)/2;
		
		System.out.printf("Esse triângulo possui %.2fm² de área.", area);
	}
}
