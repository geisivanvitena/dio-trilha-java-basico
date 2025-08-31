import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        System.out.println("Controle de Gastos da Mesada Utilizando exemplo While");
        double mesada = 50.0;

        while (mesada > 0) {
            double valorGasto = valorAleatorio();

            if (valorGasto > mesada) {
                valorGasto = mesada;
            } 
            System.out.printf("Valor gasto(R$): %.2f\n", valorGasto);
            mesada -= valorGasto;          
        }
        System.out.printf("Saldo insuficiente, sua mesada é(R$): %.2f", mesada); 
    }
    
    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);  
    }
}
