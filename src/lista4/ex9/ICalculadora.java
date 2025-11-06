package lista4.ex9;

public interface ICalculadora {
    int somar(int a, int b);

    default int subtrair(int a, int b){
        return a - b;
    }
}
