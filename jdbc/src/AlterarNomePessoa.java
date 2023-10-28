import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlterarNomePessoa {
  
  public static void main(String[] args) throws SQLException {
    Scanner entrada = new Scanner(System.in);
    Connection conexao = FabricaConexao.getConexao();
    String sqlBusca = "SELECT * FROM Pessoa WHERE codigo = ?";
    String sqlAtualiza = "UPDATE Pessoa SET nome = ? WHERE codigo = ?";
    PreparedStatement stmt = conexao.prepareStatement(sqlBusca);
    int id = 0;

    while(id == 0) {
      System.out.print("Digite o código da pessoa que será atualizada: ");
      try {
        id = entrada.nextInt();
      } catch(NumberFormatException | InputMismatchException e) {
          id = 0;
      }
      stmt.setInt(1, id);
      ResultSet resultado = stmt.executeQuery();
      if(!resultado.next()) {
        System.out.println("Não existe usuário com esse código.");
        id = 0;
      } else {
        System.out.println("Você selecionou a pessoa: " + resultado.getString("nome"));
        entrada.nextLine();
      }
    }

    System.out.print("Digite o novo Nome da pessoa: ");
    String nome = entrada.nextLine();

    stmt.close();
    stmt = conexao.prepareStatement(sqlAtualiza);
    stmt.setString(1, nome);
    stmt.setInt(2, id);
    stmt.execute();

    System.out.println("Pessoa atualizada com sucesso!");

    stmt.close();
    stmt = conexao.prepareStatement(sqlBusca);
    stmt.setInt(1, id);
    ResultSet resultado = stmt.executeQuery();

    if(resultado.next()) {
      System.out.println(resultado.getString("codigo") + " ==> " 
                       + resultado.getString("nome"));
    }

    stmt.close();
    entrada.close();
    conexao.close();
  }

}
