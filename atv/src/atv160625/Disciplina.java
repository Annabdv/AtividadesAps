package atv160625;

import java.util.HashMap;

public class Disciplina {
    private String nome;
    private int codigo;
    private HashMap<Integer, Turma> turmas = new HashMap<>();

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Turma criarTurma() {
        int codTurma = turmas.size() + 1;
        Turma turma = new Turma(codTurma, this);
        turmas.put(turma.getCodigo(), turma);
        return turma;
    }

    public Turma getTurma(int codTurma) {
        return turmas.get(codTurma);
    }
}