package lista1;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo -= valor;
    }
}
