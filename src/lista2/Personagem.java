package lista2;

public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private String id_personagem;

    // para evitar que id seja alterado após a criação, colocaremos ele no construtor e não faremos um setter para ele.
    public Personagem(String id_personagem){
        this.id_personagem = id_personagem;
    }

    public String getNome(){
        return nome;
    }

    public int getVida(){
        return vida;
    }

    public int getMana(){
        return mana;
    }

    public String getId_personagem(){
        return id_personagem;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setVida(int vida){
        if(vida < 0){
            System.out.println("Por favor, insira um valor válido!");
            return;
        }
        this.vida = vida;
    }

    public void setMana(int mana){
        if(mana < 0){
            System.out.println("Por favor, insira um valor válido!");
            return;
        }
        this.mana = mana;
    }

    public void curar(int qtd_vida){
        vida += qtd_vida;
    }

    public void levarDano(int dano){
        if(vida <= 0){
            System.out.println("O personagem já está morto.");
            return;
        }
        vida -= dano;
    }

    public void meditar(int qtd_mana){
        mana += qtd_mana;
    }
}
