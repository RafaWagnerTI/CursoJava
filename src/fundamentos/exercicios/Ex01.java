package fundamentos.exercicios;

import javax.swing.JOptionPane;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius. 
		 */
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double farenheit = Double.parseDouble(JOptionPane.showInputDialog("Coloque a temperatura em Farenheit: ").replace(",", "."));
		
		double celsius = (farenheit - AJUSTE) * FATOR;
		System.out.printf("%.2fºF são %.2fºC", farenheit, celsius);
	}
}
