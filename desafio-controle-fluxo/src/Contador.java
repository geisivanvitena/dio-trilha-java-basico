import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("GERENCIAMENTO DE CONTROLE DE FLUXO");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do parametro 1: ");
        int valorParametro1 = scanner.nextInt();
        System.out.print("Digite o valor do parametro 2: ");
        int valorParametro2 = scanner.nextInt();

        try {
            contar(valorParametro1, valorParametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            
        }
        scanner.close();
    }
    
    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O parametro 1 deve ser menor que o parametro 2.");
        }

        int contagem = parametro2 - parametro1;

        System.out.println("Número de iterações: " + contagem);
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (i+1));
        }
    }
}
