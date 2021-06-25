package Ex01_tm;

public class Disciplina {
    private String nome;
    private String cargaHoraria;

    public Disciplina(String nome, String cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }
}
