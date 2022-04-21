package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
  public static void main(String[] args) {
    Consumer<String> print = System.out::print;
    Consumer<Integer> println = System.out::println;
            //Consumer determina o tipo de informação que ele recebe, no caso integer.

    Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
    langs.forEach(print);

    String[] maisLangs = { "Python", "Lisp", "Perl", "Go\n" };
 
    //Exibe todos os que estão no array
    Stream.of(maisLangs).forEach(print);

    //Exibe todos os que estão no array
    Arrays.stream(maisLangs).forEach(print);

    //Exibe de x a y
    Arrays.stream(maisLangs, 1, 2).forEach(print);

    List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin");
    outrasLangs.stream().forEach(print); //Imprime de maneira sequência
    outrasLangs.parallelStream().forEach(print); // Imprimie de maneira paralela

    //Stream.generate(() -> "a").forEach(print); // Gera caractéres e os imprime

    Stream.iterate(0, n -> n + 1).forEach(println);

  }
}
