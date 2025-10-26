package lista3.ex2;

public class CalculadoraSimples {
    public static int somar(int a, int b){
        return a + b;
    }

    public static double somar(double a, double b){
        return a + b;
    }

    public static int somar(int[] numeros){
        int soma = 0;
        for(int i : numeros){
            soma += i;
        }

        return soma;
    }
}
