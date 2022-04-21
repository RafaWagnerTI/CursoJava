package lambdas.consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import lambdas.predicado.Produto;

public class Consumidor {

  public static void main(String[] args) {
    Consumer<Produto> imprimir = p -> System.out.println(p.nome);
  
    Produto p1 = new Produto("Caneta Azul", 12.34, 0.0);
    
    Produto p2 = new Produto("Caneta Preta", 10.30, 1.8);
   
    Produto p3 = new Produto("Caneta Vermelha", 8.50, 1.0);

    List<Produto> produtos = Arrays.asList(p1, p2, p3);

    produtos.forEach(imprimir);
    produtos.forEach(p -> System.out.println(p.preco));
    produtos.forEach(System.out::println);

  }

}
