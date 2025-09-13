package lista1;

public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;

    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void exibirDetalhes(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(numPaginas);
    }
}
