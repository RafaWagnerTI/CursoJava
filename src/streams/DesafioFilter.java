package streams;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Filme f1 = new Filme("Senhor dos Anéis: A Sociedade do Anel", "Fantasia/Aventura", 178, new GregorianCalendar(2002, 0, 1).getTime());
		Filme f2 = new Filme("Harry Potter e a Pedra Filosofal", "Fantasia/Aventura", 152, new GregorianCalendar(2001, 10, 23).getTime());
		Filme f3 = new Filme("Velozes e Furiosos", "Crime/Aventura", 106, new GregorianCalendar(2001, 8, 28).getTime());
		Filme f4 = new Filme("As Panteras", "Aventura/Ação", 98, new GregorianCalendar(2000, 10, 24).getTime());
		Filme f5 = new Filme("Canguru Jack", "Comédia/Aventura", 99, new GregorianCalendar(2003, 0, 17).getTime());
		Filme f6 = new Filme("As Branquelas", "Comédia/Crime", 109, new GregorianCalendar(2004, 5, 23).getTime());
		
		List<Filme> filmes = Arrays.asList(f1, f2, f3, f4, f5, f6);
		
		Predicate<Filme> filmeAntigo = f -> { 
			Calendar cal = Calendar.getInstance();
			cal.setTime(f.dataLancamento);
			return cal.get(Calendar.YEAR)  <= 2002; 
		};
		Predicate<Filme> filmeCurto = f -> f.duracaoEmMinutos <= 100;
		Function<Filme, String> apresentarFilme = f -> f.nome + " é um dos filmes favoritos desse usuário!";
		
		filmes.stream()
			.filter(filmeAntigo)
			.filter(filmeCurto)
			.map(apresentarFilme)
			.forEach(System.out::println);
	}
	
}
