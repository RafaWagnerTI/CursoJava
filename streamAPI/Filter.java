package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Rafael", 5);
    Aluno a2 = new Aluno("Fernando", 8);
    Aluno a3 = new Aluno("Danilo", 10);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3); 
  
    Predicate<Aluno> aprovado = a -> a.nota >= 7;
    Function<Aluno, String> saudacaoAprovado =
      a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
    
    alunos.stream()
      .filter(aprovado)
      .map(saudacaoAprovado)
      .forEach(System.out::println); 

  }
}
