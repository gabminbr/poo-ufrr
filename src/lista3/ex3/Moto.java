package lista3.ex3;

public class Moto implements VeiculoMotorizado{
    @Override
    public void ligar(){
        System.out.println("Moto ligada!");
    }

    @Override
    public void desligar(){
        System.out.println("Moto desligada!");
    }
}
