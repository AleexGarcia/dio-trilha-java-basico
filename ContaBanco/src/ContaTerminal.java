import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Informe o número da conta:");
        int numero = scanner.nextInt();
        System.out.println("Informe o número a agencia:");
        String agencia = scanner.next();
        System.out.println("Informe o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+ " e seu saldo "+saldo+" já está disponível para saque");
        scanner.close();

     }
}
