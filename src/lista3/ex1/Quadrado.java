package lista3.ex1;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(Double lado){
        super();
        this.lado = lado;
    }

    @Override
    public void calcularArea(){
        System.out.println(Math.pow(lado, 2));
    }
}
