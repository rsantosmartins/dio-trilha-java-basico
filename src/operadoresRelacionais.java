package src;

public class operadoresRelacionais {

  public static void main(String[] args) {
    String nomeUm = "Rafael";
    String nomeDois = new String("Rafael");

    System.out.println(nomeUm == nomeDois);

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    System.out.println("numeroUm é igual a numeroDois?" + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente a numeroDois?" + simNao);

    simNao = numero1 > numero2;
    System.out.println("numeroUm é maior a numeroDois?" + simNao);

  }
}
