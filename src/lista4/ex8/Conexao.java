package lista4.ex8;

public class Conexao implements IBancoDeDados{
    public void imprimeValores(){
        System.out.println(IBancoDeDados.PORTA_PADRAO);
        System.out.println(IBancoDeDados.IP_DEV);
        System.out.println(IBancoDeDados.IP_PRODUCAO);
    }
}
