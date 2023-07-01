package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto  Municipal >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 * */
		
		BinaryOperator<Double> calculaPrecoReal = (preco, desconto) -> preco * (1 - desconto);
		UnaryOperator<Double> aplicaImpostoMunicipal = precoReal -> precoReal >= 2500 ? precoReal + (precoReal * 0.085) : precoReal;
		UnaryOperator<Double> aplicaFrete = valorCImposto -> valorCImposto >= 3000 ? valorCImposto + 100 : valorCImposto + 50;
		UnaryOperator<Double> arredondaValor = valorCFrete -> Double.valueOf(String.format("%.2f", valorCFrete).replace(",", "."));
		Function<Double, String> formata = d -> "R$" + d;
		
		System.out.println(calculaPrecoReal.andThen(aplicaImpostoMunicipal)
				                           .andThen(aplicaFrete)
				                           .andThen(arredondaValor)
				                           .andThen(formata)
				                           .apply(p.preco, p.desconto));
		
	}
	
}
