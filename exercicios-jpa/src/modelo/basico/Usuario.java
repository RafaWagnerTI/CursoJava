package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Define que a classe é uma tablea do bd
public class Usuario {
	
	@Id //Obrigatório que uma entity tenha um campo Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Valor gerado automaticamente
	Long id;
	
	//@Column é usado para definir valores de uma coluna,
	//quando não usado, a aplicação define valores padrões.
	String nome;
	
	//@Transient é usado pra não enviar o valor para o BD,
	//muito usado em valores calculados
	String email;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
