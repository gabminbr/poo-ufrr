package lista4.ex10;

public class ValidadorDeNome implements IValidador{
    @Override
    public boolean validar(String texto) {
        return IValidador.isNullOrEmpty(texto);
    }
}
