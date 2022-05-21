package streamAPI;

public class Aluno {
  final String nome;
  final double nota;
  final boolean bomComportamento;

  Aluno(String nome, double nota) {
    this(nome, nota, true);
  }

  Aluno(String nome, double nota, boolean bomComportamento){
      this.nome = nome;
      this.nota = nota;
      this.bomComportamento = bomComportamento;
  }
}
