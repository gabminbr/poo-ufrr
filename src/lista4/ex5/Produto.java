package lista4.ex5;

public class Produto implements ILogavel{
    private String produto;

    public Produto(String produto){
        this.produto = produto;
    }

    @Override
    public String getInfoParaLog() {
        return produto + " registrado.";
    }
}
