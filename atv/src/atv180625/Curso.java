package atv180625;

import java.util.LinkedHashMap;

public class Curso {
    private String nome;
    private Disciplina disciplina;
    LinkedHashMap<String, Disciplina> disciplinas = new LinkedHashMap<>();
    LinkedHashMap<String, Aluno> alunos = new LinkedHashMap<>();

    public Curso() {
    }

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do curso não pode ser null");
        }
        this.nome = nome;
    }

    public Disciplina criarDisciplina(String codigo, String nome) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("O código da disciplina não pode ser vazio");
        }
        if (disciplinas.containsKey(codigo)) {
            throw new IllegalArgumentException("Não é possível cadastrar duas disciplinas com o mesmo código.");
        }
        Disciplina disciplina = new Disciplina(this, codigo, nome);
        disciplinas.put(disciplina.getCodigo(), disciplina);
        return disciplina;
    }

    public Disciplina getDisciplina(String codigo) {
        return disciplina;
    }

    public LinkedHashMap<String, Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void cadastrarAluno(Aluno aluno) {
        if (alunos.containsKey(aluno.getMatricula())) {
            throw new IllegalArgumentException("Não é possível cadastrar o mesmo aluno mais de uma vez no Curso ou cadastrar dois alunos com a mesma matrícula");
        }
        alunos.put(aluno.getMatricula(), aluno);
    }

    public LinkedHashMap<String, Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAluno(String matricula) {
        return alunos.get(matricula);
    }

    public boolean isAlunoCadastrado(String matricula) {
        return alunos.containsKey(matricula);
    }

    public boolean isAlunoCadastrado(Aluno aluno) {
        if (aluno == null) {
            return false;
        }
        return alunos.containsKey(aluno.getMatricula());
    }
}