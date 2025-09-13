package lista1;

public class Thresh {
    private String nome;
    private String lane;
    private int hpPoints = 540;
    private int mana = 200;
    private String estado = "vivo";

    public Thresh(String nome, String lane) {
        this.nome = nome;
        this.lane = lane;
    }

    public void usarHabilidade(int custo){
        if(custo > mana){
            System.out.println("Não é possível executar, falta mana.");
            return;
        }
        mana -= custo;
    }

    public void perdeuHp(int dano){
        if(dano >= hpPoints && estado.equals("vivo")){
            System.out.println("Thresh morreu.");
            estado = "morto";
        } else if(estado.equals("morto")){
            System.out.println("Thresh já está morto");
        } else {
            hpPoints -= dano;
        }
    }
}
