package lista4.ex3;

public class PenDrive implements IConectavelUSB{
    @Override
    public void conectarUSB() {
        System.out.println("PenDrive plugado!");
    }
}
