package streamAPI;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Utilitarios {

    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    public final static UnaryOperator<String> grito = n -> n + "!!!";

    public final static UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();

    public final static Function<String, String> paraDecimal = n -> String.valueOf(Integer.parseInt(n, 2));

  }
