package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() { this.listaLivros = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
        System.out.println("Livro cadastrado com sucesso!");
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {

            for (Livro livro : listaLivros) {

                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervalo = new ArrayList<>();

        if (!listaLivros.isEmpty()) {

            for (Livro livro : listaLivros) {

                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {

                    livrosPorIntervalo.add(livro);
                }
            }
        }
        return livrosPorIntervalo;
    }
    
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!listaLivros.isEmpty()) {

            for (Livro livro : listaLivros) {

                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Robert C. Martin", 2020);
        catalogo.adicionarLivro("Livro 1", "GoF", 2021);
        catalogo.adicionarLivro("Java: Como Programar", "Deitel", 2022);
        catalogo.adicionarLivro("Livro 3", "Robert C. Martin", 2023);
        catalogo.adicionarLivro("Livro 4", "GoF", 1994);
        catalogo.adicionarLivro("Java: Como Programar", "Deitel", 2014);

        System.out.println(catalogo.pesquisarPorAutor("GOF"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
    }
}


