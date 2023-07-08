package streams;

import java.util.Date;

public class Filme {

	final String nome;
	final String genero;
	final int duracaoEmMinutos;
	final Date dataLancamento;
	
	public Filme(String nome, String genero, int duracaoEmMinutos, Date dataLancamento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.dataLancamento = dataLancamento;
	}	
	
}
