package lista3.ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personagem> personagens = new ArrayList<>();
        Mago dava = new Mago("Dava jonas", 900);
        Guerreiro handsomed = new Guerreiro("Hand", 830);

        personagens.add(dava);
        personagens.add(handsomed);

        for(Personagem p : personagens){
            p.atacar();
        }

        for(Personagem p : personagens){
            if(p instanceof HabilidadeEspecial){
                ((HabilidadeEspecial) p).usarEspecial();
            }
        }
    }
}
