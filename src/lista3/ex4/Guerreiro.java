package lista3.ex4;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int pv){
        super(nome, pv);
    }
    @Override
    public void atacar(){
        System.out.println("Hirokami Kagura!");
    }
}
