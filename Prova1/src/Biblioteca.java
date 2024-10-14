import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private String nome;
    private List<Livro> livrosDisponiveis;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
        System.out.println("Livro adicionado : " + livro.getTitulo());
    }

    public boolean removerLivro(Livro livro) {
        if (livrosDisponiveis.remove(livro)) {
            System.out.println("Livro removido : " + livro.getTitulo());
            return true;
        } else {
            return false;
        }
    }

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca " + nome + ":");
        for (Livro livro : livrosDisponiveis) {
            livro.exibirInformacoes();
        }
    }
}
