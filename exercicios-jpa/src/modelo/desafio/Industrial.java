package modelo.desafio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("I")
public class Industrial extends Estabelecimento {

	@Column
	private String produtoProduzido;
	
	public Industrial() {
		
	}

	public Industrial(String nome, Double area, String produtoProduzido) {
		super();
		setNome(nome);
		setArea(area);
		setDataInauguracao(new Date());
		setProdutoProduzido(produtoProduzido);
	}

	public String getProdutoProduzido() {
		return produtoProduzido;
	}

	public void setProdutoProduzido(String produtoProduzido) {
		this.produtoProduzido = produtoProduzido;
	}
	
	
	
}
