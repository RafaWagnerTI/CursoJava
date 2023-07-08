package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		//Recebe um parâmetro de tipo genérico
		//e retorna um parâmetro do mesmo tipo
		
		UnaryOperator<Integer> maisDois = n -> n > 0 ? n  + 2 : n;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois.andThen(vezesDois)
								 .andThen(aoQuadrado)
								 .apply(0);
		
		System.out.println(resultado1);
		
		
		// andThen =/= compose
		// andThen executa da esquerda pra direita
		// compose executa da direita para esquerda
		int resultado2 = aoQuadrado.compose(vezesDois)
								   .compose(maisDois)
								   .apply(0);
		
		System.out.println(resultado2);
		
	}
	
}
