package lambdas.forEach;

import java.util.Arrays;
import java.util.List;

public class ForEach {
  public static void main(String[] args){

    List<String> aprovados = Arrays.asList("Ana","Bia","Gui","Lia");

    System.out.println("Modo tradicional...");
    for(String nome: aprovados){
      System.out.println(nome);
    }

    System.out.println("\nLambda #01...");
    aprovados.forEach((nome) -> System.out.println(nome + "!!!"));

    //Classe::Metodo
    System.out.println("\nMethod Reference #01...");
    aprovados.forEach(System.out::println);

    System.out.println("\nLambda #02...");
    aprovados.forEach((nome) -> meuImprimir(nome));

    //Classe::Metodo
    System.out.println("\nMethod Reference #02...");
    aprovados.forEach(ForEach::meuImprimir);

  }

  static void meuImprimir(String nome){
    System.out.println("Oi! Meu nome é "+ nome);
  }

}
