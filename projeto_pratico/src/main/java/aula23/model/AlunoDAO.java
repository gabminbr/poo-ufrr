package aula23.model;

import java.util.List;

public class AlunoDAO {

    public void salvar(Aluno aluno) {
        BancoDeDados.getInstance().getTabelaAlunos().add(aluno);
    }

    public List<Aluno> listarTodos() {
        return BancoDeDados.getInstance().getTabelaAlunos();
    }

}