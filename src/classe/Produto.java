package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	// Variáveis locais e constantes precisam ser inicializadas
	//de maneira explícita, até o momento de uso.
	
	Produto() {}
	
	Produto(String nome, double preco) {
		this.nome = nome; // This aponta para a instância atual do objeto
		this.preco = preco;
	}
	
	protected double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	
	protected double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
	
}
