package lista3.ex1;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(Double raio){
        super();
        this.raio = raio;
    }

    @Override
    public void calcularArea(){
        System.out.println(Math.PI * Math.pow(raio, 2));
    }
}
