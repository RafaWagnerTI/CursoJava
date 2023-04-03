package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	public static void main(String[] args) {
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ").replace(",", "."));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ").replace(",", "."));
		String operador = JOptionPane.showInputDialog("Digite a operação desejada: ").trim();
		
		double resultado = operador.equals("+") ? valor1 + valor2 : 
						   operador.equals("-") ? valor1 - valor2 :
						   operador.equals("*") ? valor1 * valor2 :
						   operador.equals("/") ? valor1 / valor2 :
						   operador.equals("%") ? valor1 % valor2 :
						   0.0;
		
		System.out.printf("O resultado de %.2f %s %.2f é %.2f", valor1, operador, valor2, resultado);
		
	}
}
