package fundamentos;

public class Ex06 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
		 * Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		 */
		int a = 1;
		int b = 12;
		int c = -13;
		
		int delta = (int) Math.pow(b, 2) - 4 * a * c;
		
		int x1 = (int) (-b + Math.sqrt(delta)) / 2 * a;
		int x2 = (int) (-b - Math.sqrt(delta)) / 2 * a;
		
		System.out.printf("X1: %d%nX2: %d%n", x1, x2);
		
		String resultado1 = ((a * Math.pow(x1, 2 )) + (b * x1) + c) == 0 ? "correto" : "incorreto";
		String resultado2 = ((a * Math.pow(x2, 2 )) + (b * x2) + c) == 0 ? "correto" : "incorreto";
		
		System.out.printf("%nX1 esta: %s%nX2 esta: %s", resultado1, resultado2);
		
	}
}
