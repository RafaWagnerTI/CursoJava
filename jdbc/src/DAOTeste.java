public class DAOTeste {
  
  public static void main(String[] args) {
    
    DAO dao = new DAO();

    String sql = "INSERT INTO pessoa (nome) VALUES (?)";
    System.out.println(dao.incluir(sql, "Aphelios"));
    System.out.println(dao.incluir(sql, "Ezreal"));
    System.out.println(dao.incluir(sql, "Kayn"));
    System.out.println(dao.incluir(sql, "K'Sante"));
    System.out.println(dao.incluir(sql, "Rhaast"));
    System.out.println(dao.incluir(sql, "Sett"));
    System.out.println(dao.incluir(sql, "Yone"));

    dao.close();
  }

}
