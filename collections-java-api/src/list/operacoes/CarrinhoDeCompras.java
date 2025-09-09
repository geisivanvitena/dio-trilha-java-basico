package list.operacoes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        System.out.println("____________________________");
        listaItem.add(new Item(nome, preco, quantidade));
        System.out.println("Item: " + nome + " adicionado com sucesso!");
        System.out.println("____________________________");
    }

    public void removerItem(String nome) {
        System.out.println("=== Removendo item ===");
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item item : listaItem) {

            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        listaItem.removeAll(itensParaRemover);
        System.out.println("Itens removidos com sucesso!");
        System.out.println("____________________________");
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Item item : listaItem) {
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.printf("Valor total do carrinho (R$): %.2f%n", total);

    }

    public void exibirItens() {
        for (Item item : listaItem) {
            System.out.println("=== Lista de itens ===");
            System.out.println("Nome: " + item.getNome());
            System.out.println("Preço(R$): " + item.getPreco());
            System.out.println("Quantidade: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Item1", 23.85, 5);
        carrinho.adicionarItem("Item2", 322.00, 15);
        carrinho.adicionarItem("Item3", 73.85, 20);
        carrinho.adicionarItem("Item4", 425.90, 30);
        carrinho.calcularValorTotal();
        carrinho.removerItem("item1");
        carrinho.exibirItens();
    }
}
