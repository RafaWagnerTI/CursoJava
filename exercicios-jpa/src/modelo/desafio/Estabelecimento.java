package modelo.desafio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "estabelecimentos")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "Tipo_Estabelecimento")
public class Estabelecimento {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Double area;
	
	private Date dataInauguracao;
	
	@ManyToMany (cascade = CascadeType.PERSIST)
	@JoinTable (name = "Estabelecimentos_Proprietarios",
			    joinColumns = @JoinColumn(name = "estabelecimentoId", referencedColumnName = "id"), 
			    inverseJoinColumns = @JoinColumn(name = "proprietarioId", referencedColumnName = "id"))
	private List<Proprietario> proprietarios;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Date getDataInauguracao() {
		return dataInauguracao;
	}

	public void setDataInauguracao(Date dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}

	public List<Proprietario> getProprietarios() {
		if (proprietarios == null) {
			proprietarios = new ArrayList<>();
		}
		return proprietarios;
	}

	public void setProprietarios(List<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
	}
	
	public void adicionarProprietario(Proprietario proprietario) {
		if(proprietario != null && !getProprietarios().contains(proprietario)) {
			getProprietarios().add(proprietario);
			
			if(!proprietario.getEstabelecimentos().contains(this) ) {
				proprietario.getEstabelecimentos().add(this);	
			}	
		}
	}
	
}
