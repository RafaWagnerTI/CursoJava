package excecao;

public class Basico {

	public static void main(String[] args) {
		
		// Error e Exception herdam de Throwable
		// Error são erros que quando ocorrem, impedem o funcionamento da aplicação por completo
		// Ex: Out of Memory
		// Exception são erros que podem ser tratados para que a aplicação continue o funcionamento
		// Ex: Request em API sem internet
		
		try {
			System.out.println(7/0);
		} catch(ArithmeticException e) {
			System.out.println("Não é possível dividir por zero :/");
		}
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch(NullPointerException e) {
			// O ideal é nunca silenciar um log, mas caso o fizer
			//coloque-o em um arquivo de texto, para caso acontecer um erro
			//você tem o registro de como e onde aconteceu.
			System.out.println("O aluno não foi instanciado :/");
		}
		
		System.out.println("Fim :)");
	}
	
	public static void imprimirNomeDoAluno(Aluno a) {
		System.out.println(a.nome);
	}
	
}
