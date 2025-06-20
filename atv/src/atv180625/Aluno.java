package atv180625;

import java.util.Objects;

public class Aluno {
    private String matricula;
    private String nome;

    public Aluno() {
        this.nome = "";
    }

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Não deve ser possível atribuir o valor `null` ao nome da classe Aluno");
        }
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null) {
            throw new IllegalArgumentException("Matricula Invalida! Matricula nao pode ser null.");
        }
        if (!matricula.matches("\\d+")) {
            throw new IllegalArgumentException("Matricula Invalida! Matricula deve ser numerica! matricula='" + matricula + "'");
        }
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome);
    }
}
