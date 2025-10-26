package lista3.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();
        Quadrado q = new Quadrado(4.0);
        Circulo c = new Circulo(5.0);
        figuras.add(q);
        figuras.add(c);

        for(FiguraGeometrica figura : figuras){
            figura.calcularArea();
        }
    }
}
