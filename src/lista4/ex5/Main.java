package lista4.ex5;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Glacial");
        Usuario u = new Usuario("Denarium");

        SistemaDeLog s = new SistemaDeLog();
        s.salvarLog(p);
        s.salvarLog(u);
    }
}
