package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	private Utilitarios() {}; // método construtor privado, não há necessidade de
							  // instanciar a classe com métodos estáticos e públicos
	
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public static String grito(String n) {
		return n + "!!! ";
	}
	
}
