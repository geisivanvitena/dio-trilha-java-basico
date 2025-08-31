import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma sigla (P, M, G): ");
        String sigla = scanner.nextLine().toUpperCase();

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default: {
                System.out.println("Indefinido");
                break;
            }

        }
        
        scanner.close();
    }
}
