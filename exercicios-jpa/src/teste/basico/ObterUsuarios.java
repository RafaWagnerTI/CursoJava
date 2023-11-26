package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuarios {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		List<Usuario> usuarios = em
				.createQuery("select u from Usuario u", Usuario.class)
				.setMaxResults(6)
				.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() + 
					" Email: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}

}
