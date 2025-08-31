
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        System.out.println("Calculadora de Médias");

        Scanner scanner = new Scanner(System.in);
        String[] alunos = { "João", "Maria", "Pedro", "Ana" };

        double media = calcularMediaAlunos(alunos, scanner);
        System.out.printf("A média das notas dos alunos é: %.1f%n", media);
        scanner.close();

    }
    
    public static double calcularMediaAlunos(String[] alunos, Scanner scanner) {
        double somaNotas = 0.0;
        for (String aluno : alunos) {
            System.out.println("Digite a nota do aluno(a): " + aluno);
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }
        return somaNotas / alunos.length;
    }
}
