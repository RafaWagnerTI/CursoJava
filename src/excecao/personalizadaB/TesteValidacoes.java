package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("asa", 7);
		
		try {
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch(StringVaziaException | 
				NumeroForaIntervaloException | 
				IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("Fim :)");
	}
	
}
