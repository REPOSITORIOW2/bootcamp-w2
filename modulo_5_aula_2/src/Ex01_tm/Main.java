package Ex01_tm;

public class Main {
    public static void main(String[] args) {

        Estudante est1 = new Estudante("Carlos", 13, 123142, "8º");
        Estudante est2 = new Estudante("Maria", 13, 123131, "8º");
        Estudante est3 = new Estudante("Mateus", 12, 1231321, "9º");
        Estudante est4 = new Estudante("Marcos", 12, 123131, "9º");
        Disciplina disc1 = new Disciplina("Matemática", "80");
        Disciplina disc2 = new Disciplina("Português", "80");
        Disciplina disc3 = new Disciplina("Artes", "40");
        Disciplina disc4 = new Disciplina("Geografia", "40");

        Turma turma1 = new Turma("9º", "C");
        Turma turma2 = new Turma("8º", "A");

        turma1.setDisciplinas(disc1);
        turma1.setDisciplinas(disc2);

        turma1.setEstudantes(est3);
        turma1.setEstudantes(est4);

        turma2.setEstudantes(est1);
        turma2.setEstudantes(est2);

        turma2.setDisciplinas(disc3);
        turma2.setDisciplinas(disc4);

        System.out.println(turma1);
        System.out.println(turma2);
    }
}
