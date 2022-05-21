package streamAPI.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {

  public static void main(String[] args) {
    Ocorrencia o1 = new Ocorrencia("985478191", "30/04/2022", 500, true);
    Ocorrencia o2 = new Ocorrencia("989819177", "29/04/2022", 800, true);
    Ocorrencia o3 = new Ocorrencia("888198448", "30/04/2022", 1900000, true);
    Ocorrencia o4 = new Ocorrencia("187178191", "30/04/2022", 1000, false);

    List<Ocorrencia> ocorrencias = Arrays.asList(o1, o2, o3, o4);

    Predicate<Ocorrencia> isHoje = o -> o.data.equals("30/04/2022");
    Predicate<Ocorrencia> isLeve = o -> o.tamanhoBytes <= 1000;
    Predicate<Ocorrencia> hasAnexo = o -> o.temAnexo;

    Function<Ocorrencia, String> ocorrenciasRestantes =
      o -> "ID: " + o.id + "! Peso: " + o.tamanhoBytes + "bytes ";

    System.out.println("Ocorrências do Dia - 30/04/2022");

    ocorrencias.stream()
      .filter(isHoje)
      .filter(isLeve)
      .filter(hasAnexo)
      .map(ocorrenciasRestantes)
      .forEach(System.out::println);

  }
  
}
