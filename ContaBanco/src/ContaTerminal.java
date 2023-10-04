import java.util.Scanner;

public class ContaTerminal {
   public int saldo;
   public int numeroConta;
   public String agencia;
   public String nomeCliente;
   public String[] dadosCliente;

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite o seu nome: ");
      String nomeCliente = scanner.nextLine();
      
      System.out.println("Digite o numero da ag\u00eancia: ");      
      String agencia = scanner.nextLine();
      
      System.out.println("Digite o numero da conta: ");
      int numeroConta = scanner.nextInt();
      System.out.println("Digite o quanto deseja depositar: ");
      int saldo = scanner.nextInt();
      
      // 
      System.out.println("Olá " + nomeCliente + "\nObrigado por criar uma conta em nosso banco, sua agência é " + agencia);
      System.out.println("O número da conta é " + numeroConta + "\nO seu saldo é de R$" + saldo + " e já está disponível para saque !");
   }
}