package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalhouTerça = false;
		boolean trabalhouQuinta = false;
		boolean comprouTV50 = trabalhouTerça && trabalhouQuinta;
		boolean comprouTV32 = trabalhouTerça ^ trabalhouQuinta;
		boolean tomouSorvete = comprouTV50 || comprouTV32;
		boolean saudavel = !tomouSorvete;
		
		System.out.printf("Comprou a TV de 50\"? %b", comprouTV50);
		System.out.printf("\nComprou a TV de 32\"? %b", comprouTV32);
		System.out.printf("\nTomou sorvete com a família? %b", tomouSorvete);
		System.out.printf("\nEstá mais saudável? %b", saudavel);
		
		
	}
	
}
