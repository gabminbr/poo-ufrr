package lista4.ex3;

public class Teclado implements IConectavelUSB{
    @Override
    public void conectarUSB() {
        System.out.println("Teclado plugado!");
    }
}
