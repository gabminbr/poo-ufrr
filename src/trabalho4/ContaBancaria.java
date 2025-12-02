package trabalho4;

public class ContaBancaria {
    private double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (saldo < 0){
            throw new ValorInvalidoException("Erro! O saldo não pode ser menor que 0R$!");
        }
        else if (saldo < valor){
            throw new SaldoInsuficienteException(String.format("Saldo insuficiente para o saque, o saldo de %.2f é menor do que o valor de saque: %.2f", this.getSaldo(), valor));
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
