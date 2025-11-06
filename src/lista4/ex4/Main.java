package lista4.ex4;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Passaro p = new Passaro();

        c.fazerSom();
        c.respirar();

        p.fazerSom();
        p.respirar();
        p.voar();
    }
}
