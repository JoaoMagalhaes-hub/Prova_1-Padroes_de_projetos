public class Main {
    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);

        // Criando um usuário
        Usuario usuario1 = new Usuario("Ana");

        // Criando uma biblioteca e adicionando livros
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.exibirLivrosDisponiveis();
        usuario1.emprestarLivro(biblioteca, livro1);
        usuario1.exibirLivrosEmprestados();
        biblioteca.exibirLivrosDisponiveis();
        usuario1.devolverLivro(biblioteca, livro1);
        biblioteca.exibirLivrosDisponiveis();
    }
}