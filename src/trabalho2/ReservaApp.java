package trabalho2;

import java.util.ArrayList;
import java.util.List;

public class ReservaApp {
    public static void main(String[] args){
        List<Integer> assentos = new ArrayList<>();
        Voo voo = new Voo(12023, 20, assentos);
        voo.reservarAssento(1);
        voo.cancelarReserva(3);
    }
}
