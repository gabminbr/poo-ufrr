package lista4.ex7;

public class SoldadoDeElite implements ISoldado{
    @Override
    public void patrulhar(){
        System.out.println("EM PATRULHA");
    }

    @Override
    public void atirar() {
        System.out.println("ATIRANDO");
    }

    @Override
    public void mirar() {
        System.out.println("MIRANDO");
    }
}
