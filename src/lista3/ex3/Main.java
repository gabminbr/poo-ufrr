package lista3.ex3;

public class Main {
    public static void estacionarVeiculo(VeiculoMotorizado veiculo){
        veiculo.desligar();
    }

    public static void main(String[] args) {
        Moto moto = new Moto();
        Carro carro = new Carro();

        estacionarVeiculo(moto);
        estacionarVeiculo(carro);
    }
}
