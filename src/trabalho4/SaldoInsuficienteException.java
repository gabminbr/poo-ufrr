package trabalho4;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String message) {
        super(message);
    }
    // irá herdar de exception pois, no programa principal, NÃO deve ser possível sacar um valor maior do que o saldo, então é uma obrigação
    // do programa que ele lance exceção e pare para esse erro, pois não é um erro de sintaxe, mas um erro de regra de negócio.
}
