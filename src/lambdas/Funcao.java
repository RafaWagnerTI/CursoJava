package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		//Recebe um único parâmetro de tipo genérico
		//e retorna um resultado de tipo genérico
		
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE =
				valor -> "O resultado é: " + valor;
				
		Function<String, String> empolgado =
				valor -> valor + "!!!";
				
				Function<String, String> duvida =
						valor -> valor + "???";
				
		String resultadoFinal1 =
				parOuImpar.andThen(oResultadoE)
						  .andThen(empolgado)
						  .apply(32);
		
		String resultadoFinal2 =
				parOuImpar.andThen(oResultadoE)
						  .andThen(duvida)
						  .apply(32);
		
		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);
		
	}
}
