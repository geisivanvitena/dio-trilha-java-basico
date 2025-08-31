import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        double saldo = 1000;

        System.out.print("Saldo Atual (R$): " + saldo + "\n");
        System.out.print("Digite o valor do saque (R$): ");
        double saque = scanner.nextDouble();

        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso no valor de (R$): " + saque);
            System.out.println("Saldo Atual (R$): " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }

        scanner.close();
    }
}
