package JavaAula4Exercício1;

public class Estudante {

	private String nome;
	private Integer idade;
	private String matricula;
	private String serie;

	public Estudante(String nome, int idade, String matricula, String serie) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.serie = serie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

}
