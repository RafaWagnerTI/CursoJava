package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> ePar = valor -> valor % 2 == 0;
		Predicate<Integer> eTresDigitos =
				num -> num >= 100 && num <= 999;
				
		System.out.println(ePar.and(eTresDigitos).negate().test(123));
		System.out.println(ePar.or(eTresDigitos).test(123));
				
	}
	
}
