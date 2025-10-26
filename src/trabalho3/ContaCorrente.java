package trabalho3;

public class ContaCorrente extends ContaBancaria{
    private Double limiteChequeEspecial;

    public ContaCorrente(Integer numConta, String agencia, Double saldo, Double limiteChequeEspecial) {
        super(numConta, agencia, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public void sacar(Double valor){
        if(saldoDisponivel(saldo, valor)){
            saldo -= valor;
        }
    }

    @Override
    public Boolean saldoDisponivel(Double saldo, Double valor){
        return saldo + limiteChequeEspecial >= valor;
    }
}
