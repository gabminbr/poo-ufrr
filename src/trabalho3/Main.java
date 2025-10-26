package trabalho3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(80092901, "0240-X", 900.00, 800.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(12930, "2030-X", 800.00, 2.2);

        contaCorrente.depositar(200.0);
        contaCorrente.sacar(300.00);

        contaPoupanca.depositar(220.00);
        contaPoupanca.sacar(2020.00);
    }
}
