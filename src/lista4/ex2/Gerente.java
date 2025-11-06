package lista4.ex2;

public class Gerente implements IAutenticavel{
    private String nome;

    public Gerente(String nome){
        this.nome = nome;
    }

    @Override
    public void login(){
        System.out.printf("Gerente %s logado com sucesso!\n", nome);
    }

    @Override
    public void logout(){
        System.out.printf("Gerente %s deslogado!\n", nome);
    }
}
