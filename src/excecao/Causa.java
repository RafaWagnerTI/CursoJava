package excecao;

public class Causa {

	public static void main(String[] args) {
		
		//Muitas vezes, o erro que estourou na tela, foi causado por conta de outro erro,
		//é possível tratar isso buscando a causa do mesmo.
		
		try {
			metodoA(null);
		} catch(IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}
	
	static void metodoA(Aluno aluno) {
		try {
		metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está NULLLOOOOOO!!!");
		}
		
		System.out.println(aluno.nome);
	}
	
}
