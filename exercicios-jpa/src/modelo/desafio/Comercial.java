package modelo.desafio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class Comercial extends Estabelecimento {

	@Column
	private String produtoVendido;

	public Comercial() {
		
	}

	public Comercial(String nome, Double area, String produtoVendido) {
		super();
		setNome(nome);
		setArea(area);
		setDataInauguracao(new Date());
		setProdutoVendido(produtoVendido);
	}
	
	public String getProdutoVendido() {
		return produtoVendido;
	}

	public void setProdutoVendido(String produtoVendido) {
		this.produtoVendido = produtoVendido;
	}
	
}
