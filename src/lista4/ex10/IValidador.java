package lista4.ex10;

public interface IValidador {
    boolean validar(String texto);

    static boolean isNullOrEmpty(String texto){
        return texto == null || texto.isEmpty();
    }
}
