package aula23.model;

public class Aluno {
    private Long id;
    private String nome;
    private String cpf;
    private String matricula;

    // Construtor
    public Aluno(String nome,
    String cpf) {
    this.nome = nome;
    this.cpf = cpf;
    }

    // Getters e Setters
    public String getNome() {
    return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }

    public String getCpf() {
    return cpf;
    }

    public void setCpf(String cpf) {
    this.cpf = cpf;
    }

    // Lógica de negócio
    public boolean validarCPF() {
    // Implementação real aqui
    return cpf.length() == 11;
    }

}
