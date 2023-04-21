package classe.exercicio;

public class Pessoa {

	String nome;
	double pesoInicial;
	double pesoAtual;
	
	Pessoa(String nome, double pesoInicial) {
		this.nome = nome;
		this.pesoInicial = pesoInicial;
		this.pesoAtual = pesoInicial;
	}
	
	protected void comerComida(Comida c) {
		if(c != null) {
			pesoAtual += c.peso;
		}
	}
	
	protected String informarPeso() {
		if(pesoInicial != pesoAtual)
			return String.format("%s tinha %.3fkg, após o jantar ficou com %.3fkg.", this.nome, this.pesoInicial, this.pesoAtual);
		return String.format("%s tem %.3fkg", this.nome, this.pesoInicial);
	}
}
