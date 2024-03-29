
package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 7.2);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 7.2);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct() // remove registros iguais e sobressalentes
			.skip(2)    // pula dois registros da lista
			.limit(2)   // limita a lista aos dois próximos
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7) // Exibe registros enquanto nota for >= 7
			.forEach(System.out::println);
	}

}
