package lista3.ex4;

public class Mago extends Personagem implements HabilidadeEspecial{
    public Mago(String nome, int pv) {
        super(nome, pv);
    }

    @Override
    public void atacar(){
        System.out.println("FIRE BALL");
    }

    @Override
    public void usarEspecial(){
        System.out.println("ZEREI TODOS OS RESIDENT EVIL");
    }
}
