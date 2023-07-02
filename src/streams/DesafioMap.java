package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. Número para String binária... 6 => "110"; 
		 * 2. Inverter a String... "110" => "011";
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		Function<Integer, String> decimalParaBinario = num -> String.format("%04d", Integer.parseInt(Integer.toBinaryString(num)));
		UnaryOperator<String> inverter = binario -> new StringBuilder(binario).reverse().toString();
		Function<String, Integer> binarioParaDecimal = binarioInvertido -> Integer.parseInt(binarioInvertido, 2);
		
		System.out.println("\nBinário Invertido");
		nums.stream()
		.map(decimalParaBinario)
		.map(inverter)
		.map(binarioParaDecimal)
		.forEach(System.out::println);
		
	}
	
}
