package lambdas.implementacaoInterface;

public class Threads {
  public static void main(String[] args) {
    Runnable trabalho3 = Threads::trabalho3;

    Thread t3 = new Thread(trabalho3);

    t3.start(); 
  }

  static void trabalho3() {
    for (int i = 0; i < 10; i++ ) {
      System.out.println("Tarefa Executando");
      try{
        Thread.sleep(1000);
      }
      catch(Exception e) {
  
      }
    }
  }

}
