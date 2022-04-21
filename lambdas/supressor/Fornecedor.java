package lambdas.supressor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
  
  public static void main(String[] args) {
    //Não tem métodos de composição, pois não retorna nada 
    Supplier<List<String>> umLista = 
      () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
    // Você pode colocar parenteses sempre, mas deve colocar sempre quando não há parametros 
    //ou quando há mais de um
  
    System.out.println(umLista.get());
  
  }

}
