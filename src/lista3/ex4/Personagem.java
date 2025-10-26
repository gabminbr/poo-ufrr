package lista3.ex4;

public abstract class Personagem {
    private String nome;
    private int pv;

    public Personagem(String nome, int pv) {
        this.nome = nome;
        this.pv = pv;
    }

    public abstract void atacar();
}
