package atv160625;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private HashMap<String, Aluno> alunos = new HashMap<>();

    public Turma(int codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    public Aluno getAluno(String matricula) {
        return alunos.get(matricula);
    }

    public List<Aluno> getAlunos() {
        List<Aluno> lista = new ArrayList<>();
        for (Aluno aluno : alunos.values()) {
            lista.add(aluno);
        }
        return lista;
    }

    public int getCodigo() {
        return codigo;
    }
}