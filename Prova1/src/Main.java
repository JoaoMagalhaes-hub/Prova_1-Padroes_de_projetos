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

        
        System.out.println("\n--- Usuário Emprestando Livro ---");
        usuario1.emprestarLivro(biblioteca, livro1);

        
        System.out.println("\n--- Exibindo Livros Emprestados pelo Usuário ---");
        usuario1.exibirLivrosEmprestados();

        
        System.out.println("\n--- Exibindo Livros Disponíveis Após Empréstimo ---");
        biblioteca.exibirLivrosDisponiveis();

        
        System.out.println("\n--- Usuário Devolvendo Livro ---");
        usuario1.devolverLivro(biblioteca, livro1);

        
        System.out.println("\n--- Exibindo Livros Disponíveis Após Devolução ---");
        biblioteca.exibirLivrosDisponiveis();
    }
}