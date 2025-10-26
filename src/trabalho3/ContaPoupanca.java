package trabalho3;

public class ContaPoupanca extends ContaBancaria{
    private Double taxaDeRendimento;

    public ContaPoupanca(Integer numConta, String agencia, Double saldo, Double taxaDeRendimento) {
        super(numConta, agencia, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public Double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }
}
