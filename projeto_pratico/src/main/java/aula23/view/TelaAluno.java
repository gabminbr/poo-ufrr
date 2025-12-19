/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23.view;
import javax.swing.*; // Para JFrame, JButton, JTextField, JOptionPane
import java.awt.*;    // Para FlowLayout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import aula23.controller.AlunoController;
import aula23.model.Aluno;
import java.util.List;
/**
 *
 * @author Jean
 */
public class TelaAluno extends JFrame {
 private JTextField txtNome;
 private JTextField txtCPF;
 private JButton btnSalvar;
 private AlunoController controller;

    public TelaAluno() {
        super("Cadastro de Aluno"); // Define o título da janela
        
        inicializarComponentes();
        
        // Conecta com o Controller passando "this" (esta tela) como referência
        controller = new AlunoController(this); 
        
        configurarEventos();
        
        // 2. CONFIGURAÇÕES FINAIS DA JANELA (essenciais para ela aparecer)
        this.setSize(300, 200); // Tamanho
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela
        this.setLocationRelativeTo(null); // Centraliza na tela
        this.setVisible(true); // Torna visível


        JButton btnListar = new JButton("Listar no Console");

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.listarAlunos(); 
            }
        });

        this.add(btnListar); // Adiciona ao layout
    }

    private void inicializarComponentes() {
        // Define que os componentes ficarão lado a lado (fluxo)
        this.setLayout(new FlowLayout()); 

        txtNome = new JTextField(20);
        txtCPF = new JTextField(11);
        btnSalvar = new JButton("Salvar");

        // 3. ADICIONA OS COMPONENTES NA TELA
        // Sem isso, eles existem na memória mas não aparecem para o usuário
        this.add(new JLabel("Nome:"));
        this.add(txtNome);
        
        this.add(new JLabel("CPF:"));
        this.add(txtCPF);
        
        this.add(btnSalvar);
    }

    private void configurarEventos() {
        btnSalvar.addActionListener(e -> {
            // Garante que o controller existe antes de chamar
            if (controller != null) {
                controller.salvarAluno(
                    txtNome.getText(),
                    txtCPF.getText()
                );
            }
        });
    }

    public void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void limparFormulario() {
        txtNome.setText("");
        txtCPF.setText("");
        txtNome.requestFocus(); // Coloca o cursor de volta no nome
    }

    public void exibirAlunos(List<Aluno> alunos) {
        StringBuilder sb = new StringBuilder("Alunos cadastrados:\n");
        for (Aluno aluno : alunos) {
            sb.append("Nome: ").append(aluno.getNome()).append(", CPF: ").append(aluno.getCpf()).append("\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString());
    }
}
