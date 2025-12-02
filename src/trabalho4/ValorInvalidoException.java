package trabalho4;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String message) {
        super(message);
    }
    // definida como unchecked pois é um erro que deve ser tratado pelo programador, então deve ser parado imediatamente assim que ocorrer,
    // desse modo, nao necessitando de um bloco try catch.
}
