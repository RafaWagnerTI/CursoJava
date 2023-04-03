package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "rafa".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "rafa").toUpperCase().concat("!!!");
		System.out.println(y);
		
		//Tipo Primitivo - Armazena apenas seu próprio valor e por isso não tem notação ponto.
		//Vantagem = Mais Leve / Desvantagme = Mais Pobre.
		int a = 3;
		System.out.println(a);
		
		
		
	}
	
}
