package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected double velocidadeAtual;
	private int delta;
	
	Carro() {
		this(30, 5);
	}
	
	Carro(int velocidadeMaxima, int delta) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
		setDelta(delta);
	}
	
	public  double acelerar() {
		if(velocidadeAtual + getDelta() >= VELOCIDADE_MAXIMA) {
			return velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		return velocidadeAtual+= getDelta();
	}
	
	public double frear() {
		if(velocidadeAtual < getDelta()) {
			return velocidadeAtual=0;
		}
		return velocidadeAtual-= getDelta();
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
