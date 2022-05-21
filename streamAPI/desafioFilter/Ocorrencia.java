package streamAPI.desafioFilter;

public class Ocorrencia {
  final String id;
  final String data;
  final int tamanhoBytes;
  final boolean temAnexo;

  Ocorrencia(String id, String data, int tamanhoBytes, boolean temAnexo) {
      this.id = id;
      this.data = data;
      this.tamanhoBytes = tamanhoBytes;
      this.temAnexo = temAnexo;
  }
}
