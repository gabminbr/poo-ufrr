package trabalho4;

public class AppBanco {
    public static void main(String[] args) {
        ContaBancaria lethicia = new ContaBancaria();
        lethicia.depositar(-90);
        try{
            lethicia.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Houve um erro: " + e.getMessage());;
        }
    }
}
