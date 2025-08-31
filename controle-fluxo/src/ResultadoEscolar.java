import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("Digite a nota do aluno: ");
        int nota = scanner.nextInt();

        // Operador ternário: verifica se a nota é maior ou igual a 7
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println("O aluno foi: " + resultado);

        scanner.close();
    }
}
