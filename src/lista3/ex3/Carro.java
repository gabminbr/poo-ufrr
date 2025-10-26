package lista3.ex3;

public class Carro implements VeiculoMotorizado{
    @Override
    public void ligar(){
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar(){
        System.out.println("Carro Desligado");
    }
}
