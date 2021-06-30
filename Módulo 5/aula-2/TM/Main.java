package JavaAula4Exercício1;

public class Main {

	public static void main(String[] args) {

		Estudante e1 = new Estudante("Daniel", 16, "291-3", "2 - ano");
		Estudante e2 = new Estudante("Izabella", 14, "292-5", "2 - ano");
		Estudante e3 = new Estudante("Douglas", 15, "294-7", "2 - ano");

		Estudante e4 = new Estudante("Daniela", 16, "293-3", "3 - ano");
		Estudante e5 = new Estudante("Gabriel", 14, "295-5", "3 - ano");
		Estudante e6 = new Estudante("Daniela", 15, "294-7", "3 - ano");

		Disciplina mat = new Disciplina("Matematica", 25);
		Disciplina port = new Disciplina("Portugues", 25);
		Disciplina fisica = new Disciplina("Fisica", 15);

		Turma turma1 = new Turma("2", "A");
		Turma turma2 = new Turma("3", "B");
		Turma turma3 = new Turma("2", "B");

		turma1.adicionarDisciplina(fisica);
		turma1.adicionarDisciplina(mat);
		turma1.adicionarDisciplina(port);

		turma1.adicionarEstudante(e1);
		turma1.adicionarEstudante(e2);

		turma2.adicionarDisciplina(fisica);
		turma2.adicionarDisciplina(mat);
		turma2.adicionarDisciplina(port);

		turma2.adicionarEstudante(e4);
		turma2.adicionarEstudante(e5);

		turma3.adicionarDisciplina(fisica);
		turma3.adicionarDisciplina(mat);
		turma3.adicionarDisciplina(port);

		turma3.adicionarEstudante(e3);
		turma3.adicionarEstudante(e6);

	}

}
