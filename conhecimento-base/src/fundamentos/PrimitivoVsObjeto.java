package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		String s = new String("texto");
		s.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos primitivos
		int a = 123; // Tipo Primitivo
		Integer b = 123; // Objeto int com vários métodos que envolvem seu valor
		System.out.println(a);
		System.out.println(b);
	}

}
