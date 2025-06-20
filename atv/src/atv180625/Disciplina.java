package atv180625;

import java.util.LinkedHashMap;

public class Disciplina {
    private Curso curso;
    private String codigo;
    private String nome;
    LinkedHashMap<Integer, Turma> turmas = new LinkedHashMap<>();

    public Disciplina(Curso curso, String codigo, String nome) {
        if (codigo == null) {
            throw new IllegalArgumentException("O codigo da disciplina não pode ser `null`");
        }
        if (curso == null) {
            throw new IllegalArgumentException("O curso da disciplina não pode ser `null`");
        }
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Turma criarTurma() {
        int cod = turmas.size() + 1;
        Turma turma = new Turma(cod, this);
        turmas.put(cod, turma);
        return turma;
    }

    public Turma getTurma(int codigo) {
        if (codigo <= 0 || !turmas.containsKey(codigo)) {
            throw new IllegalArgumentException("Turma não encontrada para o código: " + codigo);
        }
        return turmas.get(codigo);
    }

    public LinkedHashMap<Integer, Turma> getTurmas() {
        return turmas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome da disciplina não pode ser nulo");
        }
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Curso getCurso() {
        return curso;
    }
}