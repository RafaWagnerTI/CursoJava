package lambdas.predicado;

public class Produto {
  public final String nome;
  public final double preco;
  public final double desconto;

  public Produto(String nome, double preco, double desconto) {
    this.nome = nome;
    this.preco = preco;
    this.desconto = desconto;
  }

  public String getNome() {
    return this.nome;
  }


  public double getPreco() {
    return this.preco;
  }


  public double getDesconto() {
    return this.desconto;
  }

  @Override
  public String toString() {
    super.toString();
    return "O produto é um(a) " + nome + ", custa: " + preco + "R$"; 
  }

}
