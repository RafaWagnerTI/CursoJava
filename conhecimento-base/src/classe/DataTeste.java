package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data d1 = new Data(19, 4, 2023);
		
		Data d2 = new Data();
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
	
}
