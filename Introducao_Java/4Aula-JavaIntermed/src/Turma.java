import java.util.Arrays;

public class Turma {

    private String serie;
    private String codigo;
    private int nEstudante = 0;
    private int nDisciplina = 0;

    private final int NUM_ESUTANTES = 5;
    private final int NUM_DISCIPLINA = 5;

    private Estudante[] estudantes = new Estudante[NUM_ESUTANTES];
    private Disciplina[] disciplinas = new Disciplina[NUM_DISCIPLINA];

    public Turma(String serie, String codigo) {

        this.serie = serie;
        this.codigo = codigo;
        this.estudantes = estudantes;
        this.disciplinas = disciplinas;
    }

    public void addEstudante(Estudante estudante) {
        if (nEstudante < NUM_ESUTANTES){
            estudantes[nEstudante] = estudante;
            nEstudante++;
        }
    }
    public void addDisciplina(Disciplina disciplina){
        if(nDisciplina < NUM_DISCIPLINA){
            disciplinas[nDisciplina] = disciplina;
            nDisciplina++;
        }
    }

    public Turma() {

    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", codigo='" + codigo + '\'' +
                ", estudantes=" + Arrays.toString(estudantes) +
                ", disciplinas=" + Arrays.toString(disciplinas) +
                '}';
    }
}
