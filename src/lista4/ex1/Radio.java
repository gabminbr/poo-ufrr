package lista4.ex1;

public class Radio implements IAparelho{
    @Override
    public void ligar(){
        System.out.println("O rádio está ligado.");
    }

    @Override
    public void desligar(){
        System.out.println("O rádio está desligado.");
    }
}
