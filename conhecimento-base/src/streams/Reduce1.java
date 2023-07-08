package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		//Necessário tomar cuidado pois, pelo acumulador não ter sido declarado
		//o Get pode retornar um tipo indesejado.
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		//Por ter um valor inicial definido para o acumulador a aplicação sabe oque será retornado
		Integer total2 = nums.parallelStream().reduce(100, soma); 
		System.out.println(total2);
		// Por se tratar de Parallel Stream, onde varias repetições são iniciadas simultaneamente,
		// cada repetição inicial adiciona o acumulador inicial
	
		
		//Resultado é um Optional<Integer>
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
	
}
