package lista4.ex6;

public class Robo implements IMovivel, IEmissorSom{
    private int x;
    private int y;

    public Robo(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void mover(int x, int y) {
        this.x += x;
        this.y += y;

        System.out.println("nova posição (x,y): (" + this.x + ", " + this.y + ")");
    }

    @Override
    public void fazerSom() {
        System.out.println("SKJDNKJASKJDMNAKJSD");
    }
}
