import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
 
    public static void main(String[] args) throws SQLException {

    Scanner entrada = new Scanner(System.in);
    Connection conexao = FabricaConexao.getConexao();
    String sql = "SELECT * FROM Pessoa WHERE nome LIKE ?";
    PreparedStatement stmt = conexao.prepareStatement(sql);

    System.out.print("Informe parte do nome: ");
    String busca = entrada.nextLine();

    stmt.setString(1, "%" + busca + "%");
    ResultSet resultado = stmt.executeQuery();

    List<Pessoa> pessoas = new ArrayList<>();

    while(resultado.next()) {
      int codigo = resultado.getInt("codigo");
      String nome = resultado.getString("nome");
      pessoas.add(new Pessoa(codigo, nome));
    }

    for(Pessoa p: pessoas) {
      System.out.println(p.getCodigo() + " ==> " + p.getNome());
    }

    stmt.close();
    entrada.close();
    conexao.close();
  }

}
