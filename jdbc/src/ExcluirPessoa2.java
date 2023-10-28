import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa2 {
  
  public static void main(String[] args) throws SQLException{

    Scanner entrada = new Scanner(System.in);

    Connection conexao = FabricaConexao.getConexao();
    String sql = "SELECT * FROM Pessoa";
    String sqlBuscaPessoa = "SELECT * FROM Pessoa WHERE nome = ?";
    String sqlExcluirPessoa = "DELETE FROM Pessoa WHERE codigo = ?";

    PreparedStatement stmt = conexao.prepareStatement(sql);
    ResultSet resultado = stmt.executeQuery();

    System.out.println("Lista de Pessoas:");

    while(resultado.next()) {
      System.out.println(resultado.getString("nome"));
    }

    stmt.close();

    int codigo = 0;
    String nome = "";
    String respostaUsuario = "";
    stmt = conexao.prepareStatement(sqlBuscaPessoa);
    while (nome.equals("")) {
      System.out.println("Digite o nome completo da pessoa que você deseja excluir: "); 
      nome = entrada.nextLine();

      stmt.setString(1, nome);
      ResultSet resultadoBusca = stmt.executeQuery();

      if(resultadoBusca.next()) {
        codigo = resultadoBusca.getInt("codigo");
        do {
          System.out.println("Você deseja realmente excluir " + 
                             resultadoBusca.getString("nome") + "? (s/N) ");
          respostaUsuario = entrada.nextLine();      
        } while(!(respostaUsuario.equalsIgnoreCase("s") || 
                  respostaUsuario.equalsIgnoreCase("n") ||
                  respostaUsuario.equals("")));

      } else {
        System.out.println("Nome não encontrado!");
        nome = "";
      }
    }
  
    stmt.close();

    if(respostaUsuario.equals("") ||
      respostaUsuario.equalsIgnoreCase("n")) {
      System.out.println("Procedimento cancelado!");
    } else {
      stmt = conexao.prepareStatement(sqlExcluirPessoa);
      stmt.setInt(1, codigo);
      stmt.execute();
      System.out.println("Registro excluído com sucesso!");
    }

    stmt.close();
    conexao.close();
    entrada.close();
  }

}
