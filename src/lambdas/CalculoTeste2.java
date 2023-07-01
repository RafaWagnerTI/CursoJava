package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { return x + y; };
		
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y; // quando você não coloca chave, o Java entende que,
								//dentro da função haverá uma única sentença de código,
								//o resultado dessa sentença será retornado como resultado
		
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.executar2(2, 3));
		
		System.out.println(Calculo.executar3(2, 3));
	}
	
}
