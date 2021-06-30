package JavaAula4Exercício1;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String serie;
	private String codigoIdentificador;

	private List<Disciplina> disciplinas;
	private List<Estudante> estudantes;

	public Turma() {

	}

	public Turma(String serie, String codigoIdentificador) {
		super();
		this.serie = serie;
		this.codigoIdentificador = codigoIdentificador;
		this.disciplinas = new ArrayList<>();
		this.estudantes = new ArrayList<>();
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	public void adicionarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	public void adicionarEstudante(Estudante estudante) {
		estudantes.add(estudante);
	}

}
