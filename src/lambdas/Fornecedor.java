package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		//Não recebe nada de parâmetro
		//Entrega um parâmetro genérico
		
		Supplier<List<String>> umaLista =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
				
		System.out.println(umaLista.get());
		
	}
}
