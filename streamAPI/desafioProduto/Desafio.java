package streamAPI.desafioProduto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {

  public static void main(String[] args) {
    Produto p1 = new Produto("Mouse LGB", 75.0, true);
    Produto p2 = new Produto("Cadeira Ergonomica nada econominca", 0.0, false);
    Produto p3 = new Produto("Mesa Bom Chi Bom Chi Bom Bom", 25.0, true);
    
    List<Produto> produtos = Arrays.asList(p1, p2, p3); 
  
    Predicate<Produto> promocaoBoa = p -> p.promocao >= 30 && p.isFreteGratis;

    Function<Produto, String> produtosBarotos = p -> "O produto " + p.nome + " está com preço "
      + "muito bom!";


    produtos.stream()
      .filter(promocaoBoa)
      .map(produtosBarotos)
      .forEach(System.out::println);

  }
  
}
