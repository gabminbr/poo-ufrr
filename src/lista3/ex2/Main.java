package lista3.ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println(CalculadoraSimples.somar(2, 4));
        System.out.println(CalculadoraSimples.somar(2.0, 4.5));
        int[] numeros = {1, 2, 3, 4};
        System.out.println(CalculadoraSimples.somar(numeros));
    }
}
