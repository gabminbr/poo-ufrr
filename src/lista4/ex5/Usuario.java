package lista4.ex5;

public class Usuario implements ILogavel{
    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public String getInfoParaLog() {
        return nome + " registrado!";
    }
}
