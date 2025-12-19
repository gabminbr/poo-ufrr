/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23.controller;

import aula23.model.Aluno;
import aula23.model.AlunoDAO;
import aula23.view.TelaAluno;

/**
 *
 * @author Jean
 */
public class AlunoController {
    private TelaAluno view;
    private AlunoDAO alunoDAO;

    public AlunoController(TelaAluno view) {
        this.view = view;
        // Agora isso vai funcionar porque criamos a classe acima!
        this.alunoDAO = new AlunoDAO();
    }

    public void salvarAluno(String nome, String cpf) {
        // 1. Validação de campos vazios
        if (nome.trim().isEmpty() || cpf.trim().isEmpty()) {
            view.exibirMensagem("Preencha todos os campos!");
            return;
        }

        // 2. Cria o objeto Model
        Aluno aluno = new Aluno(nome, cpf);

        // 3. Valida regra de negócio (CPF)
        if (!aluno.validarCPF()) {
            view.exibirMensagem("CPF inválido! Deve conter 11 dígitos.");
            return;
        }

        // 4. Persiste no "Banco de Dados"
        alunoDAO.salvar(aluno);

        // 5. Feedback para o usuário
        view.exibirMensagem("Salvo com sucesso!");
        view.limparFormulario();
    }

    public void listarAlunos() {
        // Busca a lista de alunos
        var alunos = alunoDAO.listarTodos();
        // Exibe na view
        view.exibirAlunos(alunos);
    }
}

