package lista4.ex3;

public class Main {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Teclado t = new Teclado();
        PenDrive p = new PenDrive();

        Computador c = new Computador();
        c.conectarDispositivo(m);
        c.conectarDispositivo(t);
        c.conectarDispositivo(p);
    }
}
