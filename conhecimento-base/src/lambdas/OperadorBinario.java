package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		//Recebe dois parâmetros de tipo genérico, mas que precisam ser do mesmo tipo
		//Retorna um resultado do mesmo tipo genérico dos parâmetros
		
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2) / 2;
				
		System.out.println(media.apply(9.8, 5.7));
		
		//Recebe dois parâmetros de tipo genérico, mas que podem ser distintos
		//Retorna um resultado que pode ser de outro tipo genérico dos parâmetros
		
		BiFunction<Double, Double, String> resultado = (n1, n2) ->  {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		System.out.println(resultado.apply(9.7, 4.1));
		
		// Recebe um Double e retorna um String
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));
		
	}
	
}
