package atv180625;

import java.util.LinkedHashMap;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private Curso curso;
    LinkedHashMap<String, Aluno> alunos = new LinkedHashMap<>();

    public Turma(int codigo, Disciplina disciplina) {
        if (codigo < 0) {
            throw new IllegalArgumentException("O código da turma não pode ser negativo");
        }
        if (disciplina ==  null) {
            throw new IllegalArgumentException("A disciplina passada para a turma não pode ser null");
        }
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.curso = disciplina.getCurso();

    }

    public int getCodigo() {
        return codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (professor == null) {
            throw new IllegalArgumentException("Turma não pode receber um professor null");
        }
        this.professor = professor;
    }

    public Aluno matricularAluno(Aluno aluno) throws UnsupportedOperationException {
        if (!curso.isAlunoCadastrado(aluno.getMatricula())) {
            throw new UnsupportedOperationException("Não deve ser possível matricular um aluno em uma turma se este aluno não estiver cadastrado no curso da disciplina");
        }
        alunos.put(aluno.getMatricula(), aluno);
        return aluno;
    }

    public LinkedHashMap<String, Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAluno(String matricula) {
        return alunos.get(matricula);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}
