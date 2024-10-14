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

        System.out.println("\n--- Exibindo Livros Disponíveis ---");
        biblioteca.exibirLivrosDisponiveis();

        // Usuário empresta um livro
        System.out.println("\n--- Usuário Emprestando Livro ---");
        usuario1.emprestarLivro(biblioteca, livro1);

        // Exibindo livros emprestados pelo usuário
        System.out.println("\n--- Exibindo Livros Emprestados pelo Usuário ---");
        usuario1.exibirLivrosEmprestados();

        // Exibindo livros disponíveis após o empréstimo
        System.out.println("\n--- Exibindo Livros Disponíveis Após Empréstimo ---");
        biblioteca.exibirLivrosDisponiveis();

        // Usuário devolve o livro
        System.out.println("\n--- Usuário Devolvendo Livro ---");
        usuario1.devolverLivro(biblioteca, livro1);

        // Exibindo livros disponíveis após a devolução
        System.out.println("\n--- Exibindo Livros Disponíveis Após Devolução ---");
        biblioteca.exibirLivrosDisponiveis();
    }
}