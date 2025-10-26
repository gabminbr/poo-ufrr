package trabalho3;

public abstract class ContaBancaria {
    protected Integer numeroDaConta;
    protected String agencia;
    protected Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public ContaBancaria(Integer numConta, String agencia, Double saldo){
        numeroDaConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void sacar(Double valor){
        if(saldoDisponivel(this.saldo, valor)){
            saldo -= valor;
        }
    }

    public void depositar(Double valor){
        saldo += valor;
    }

    public Boolean saldoDisponivel(Double saldo, Double valorSaque){
        return saldo >= valorSaque;
    }
}
