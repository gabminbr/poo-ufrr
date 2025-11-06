package lista4.ex3;

public class Mouse implements IConectavelUSB{
    @Override
    public void conectarUSB() {
        System.out.println("Mouse plugado!");
    }
}
