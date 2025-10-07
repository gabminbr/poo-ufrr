package trabalho2;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private int codigo;
    private int capacidade;
    private List<Integer> assentosReservados = new ArrayList<>();

    public Voo(int codigo, int capacidade, List<Integer> assentosReservados){
        this.codigo = codigo;
        this.capacidade = capacidade;
        this.assentosReservados = assentosReservados;
    }

    private boolean getDisponibilidade(Integer assento){
        if (assentosReservados.contains(assento) || assento > capacidade){
            return false;
        }
        return true;
    }

    public void reservarAssento(Integer assento){
        if(getDisponibilidade(assento)){
            assentosReservados.add(assento);
            System.out.printf("Assento %d reservado!\n", assento);
            return;
        }
        System.out.println("Assento já reservado");
    }

    public void cancelarReserva(Integer assento){
        if(assentosReservados.contains(assento)){
            assentosReservados.remove(assento);
            System.out.printf("Reserva do assento %d cancelado!\n", assento);
            return;
        }
        System.out.println("Assento não existe!");
    }
}
