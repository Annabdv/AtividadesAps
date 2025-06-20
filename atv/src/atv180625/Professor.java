package atv180625;

import java.util.Objects;

public class Professor {
    private String siape;
    private String nome;

    public Professor(String siape, String nome) {
        if (siape == null) {
            throw new IllegalArgumentException("O siape não pode ser null");
        }
        if (siape.isEmpty()) {
            throw new IllegalArgumentException("O siape não pode ser vazio");
        }

        if (!siape.matches("\\d+")) {
            throw new IllegalArgumentException("O siape deve ser um número");
        }
        this.siape = siape;
        this.nome = nome;
    }

    public String getSiape() {
        return siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("O nome não pode ser null");
        }
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(siape, professor.siape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siape, nome);
    }
}
