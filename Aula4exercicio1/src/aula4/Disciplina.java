package aula4;

public class Disciplina {

    private String nome;
    private int cargaHorario;

    public Disciplina(String nome, int cargaHorario) {
        this.nome = nome;
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "Nome='" + nome + '\'' +
                ", Carga Horario=" + cargaHorario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }
}
