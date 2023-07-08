package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String salario1, salario2, salario3;
		double salario1Conv, salario2Conv, salario3Conv, media;
		
		System.out.print("Informe o primeiro salário: ");
		salario1 = teclado.next();
		
		System.out.print("Informe o segundo salário: ");
		salario2 = teclado.next();
		
		System.out.print("Informe o terceiro salário: ");
		salario3 = teclado.next();
		
		salario1Conv = Double.parseDouble(salario1.replace(",", "."));
		salario2Conv = Double.parseDouble(salario2.replace(",", "."));
		salario3Conv = Double.parseDouble(salario3.replace(",", "."));
		
		media = (salario1Conv + salario2Conv + salario3Conv) / 3;
		
		System.out.printf("Sua média salarial é: %.2f R$.", media);
		
		teclado.close();
		
	}
	
}
