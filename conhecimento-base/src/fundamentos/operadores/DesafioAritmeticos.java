package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		
		double dividendoA = Math.pow((6 * (3 + 2)), 2);
		double divisorA = 3 * 2;
		double resultadoA = dividendoA / divisorA;
		
		double dividendoB = (1-5)*(2-7);
		double divisorB = 2;
		double resultadoB = Math.pow((dividendoB / divisorB), 2);
		
		
		double dividendoGeral = Math.pow((resultadoA - resultadoB), 3);
		double divisorGeral = Math.pow(10, 3);
		
		System.out.println(dividendoGeral / divisorGeral);
	}
}
