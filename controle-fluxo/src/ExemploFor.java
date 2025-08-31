public class ExemploFor {
    public static void main(String[] args) throws Exception {

        // Exemplo de laço for
        for (int i = 0; i < 10; i++) {
            System.err.println("Valor de i: " + i);
        }

        System.out.println("--------------------------------------");

        // Exemplo de laço for com array
        String[] nomes = { "Usuario1", "Teste2", "Funcionario1" };
        for (int index = 0; index < nomes.length; index++) {
            System.out.println("Nome na posição: " + index + " é: " + nomes[index]);
        }

        System.out.println("--------------------------------------");

        // Exemplo de laço for each
        int contador = 0;
        for (String nome : nomes) {
            System.out.println("Cliente na posição " + contador + ": Nome: " + nome);
        }  
    }
}
