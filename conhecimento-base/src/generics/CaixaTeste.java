package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<Double> caixaA = new Caixa<>();
		caixaA.guardar(145.27);
		
		System.out.println(caixaA.abrir());
		
		Caixa<String> caixaB = new Caixa<>();
		caixaB.guardar("Olá");
		
		System.out.println(caixaB.abrir());
	}
}
