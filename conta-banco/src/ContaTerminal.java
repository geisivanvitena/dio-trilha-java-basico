import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        System.out.println("== SMART BANK APP ==");

        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.print("Digite o Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o Número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o Número da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o Saldo da Conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
