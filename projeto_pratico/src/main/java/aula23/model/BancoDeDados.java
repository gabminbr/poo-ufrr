package aula23.model;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private static BancoDeDados instance;
    
    private List<Aluno> tabelaAlunos;

    private BancoDeDados() {
        this.tabelaAlunos = new ArrayList<>();
    }

    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }

    public List<Aluno> getTabelaAlunos() {
        return tabelaAlunos;
    }
}