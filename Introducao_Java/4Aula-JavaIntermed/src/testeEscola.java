import java.util.Scanner;

public class testeEscola {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Vitor",22,12460,"9");
        Estudante estudante2 = new Estudante("Ygor",22,12461,"7");
        Estudante estudante3 = new Estudante("Elvis",24,12462,"8");

        Disciplina diciplica1 = new Disciplina("Matematica",20);
        Disciplina diciplica2 = new Disciplina("Biologia",10);
        Disciplina diciplica3 = new Disciplina("Geografia",5);


        // ======== Composicao
        Turma turma3 = new Turma("9" , "C");
        Turma turma2 = new Turma("7" , "B");
        Turma turma1 = new Turma("8" , "A");

        // ======== Agregacao
//        Turma turma3 = new Turma("9" , "C" , estudante1 , disciplina1);
//        Turma turma2 = new Turma("7" , "B", estudante2 , disciplina2);
//        Turma turma1 = new Turma("8" , "A", estudante3, disciplina3);

        turma1.addDisciplina(diciplica1);
        turma2.addDisciplina(diciplica1);
        turma3.addDisciplina(diciplica2);
        turma3.addDisciplina(diciplica3);
        turma2.addDisciplina(diciplica2);

        turma1.addEstudante(estudante1);
        turma1.addEstudante(estudante2);
        turma2.addEstudante(estudante2);
        turma3.addEstudante(estudante3);
        turma2.addEstudante(estudante3);


        System.out.println(turma1);
        System.out.println(turma2);
        System.out.println(turma3);


    }
}
