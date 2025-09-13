package lista1;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis",
                "J.R.R Tolkien", 1200);
        Livro livro2 = new Livro("1984", "George Orwell", 328);

        livro1.exibirDetalhes();

        livro2.exibirDetalhes();
    }
}
