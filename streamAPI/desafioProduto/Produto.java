package streamAPI.desafioProduto;

public class Produto {
  final String nome;
  final double promocao;
  final boolean isFreteGratis;

  Produto(String nome, double promocao, boolean isFreteGratis) {
    this.nome = nome; 
    this.promocao = promocao;
    this.isFreteGratis = isFreteGratis; 
  }
}
