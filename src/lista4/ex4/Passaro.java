package lista4.ex4;

public class Passaro extends Animal implements IVoador{
    @Override
    public void fazerSom(){
        System.out.println("piu piu");
    }

    @Override
    public void voar(){
        System.out.println("O passaro esta voando!");
    }
}
