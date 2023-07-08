package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		if(d1 != null) { // Tratativa para validar se tem apontamento na memória
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) { // Tratativa para validar se tem apontamento na memória
			System.out.println(s2.concat("???"));
		}
		
	}
	
}
