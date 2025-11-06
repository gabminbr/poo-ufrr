package lista4.ex1;

public class Televisao implements IAparelho{
    @Override
    public void ligar(){
        System.out.println("A TV está ligada.");
    }

    @Override
    public void desligar(){
        System.out.println("A TV está desligada.");
    }
}
