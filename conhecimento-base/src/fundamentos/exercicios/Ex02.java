package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. 
		 */
		final int AJUSTE = 32;
		final double FATOR = 9.0/5.0;
		
		double celsius = Double.parseDouble(JOptionPane.showInputDialog("Coloque a temperatura em Celsius: ").replace(",", "."));
		
		double farenheit = (celsius * FATOR) + AJUSTE;
		System.out.printf("%.2fºC são %.2fºF", celsius, farenheit);
	}
}
