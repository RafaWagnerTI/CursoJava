import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa1 {
  
  public static void main(String[] args) throws SQLException {
    
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o código da pessoa que será excluída: ");
    int codigo = entrada.nextInt();

    Connection conexao = FabricaConexao.getConexao();
    String sql = "DELETE FROM pessoa WHERE codigo = ?";

    PreparedStatement stmt = conexao.prepareStatement(sql);
    stmt.setInt(1, codigo);

    int contador = stmt.executeUpdate();

    if(contador > 0) {
      System.out.println("Pessoa excluída com sucesso!");
    } else {
      System.out.println("Nenhuma operação realizada!");
    }

    System.out.println("Linhas afetadas: " + contador);

    conexao.close();
    entrada.close();


  }

}
