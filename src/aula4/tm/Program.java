package aula4.tm;

public class Program {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Adriana", 25, 1234, "9º Ano");
        Estudante estudante2 = new Estudante("Amanda", 25, 2345, "8º Ano");
        Estudante estudante3 = new Estudante("João", 25, 3456, "9º Ano");
        Estudante estudante4 = new Estudante("Ângelo", 25, 4567, "9º Ano");
        Estudante estudante5 = new Estudante("Maurício", 25, 5678, "8º Ano");

        Estudante[] alunos1 = {estudante1, estudante4, estudante3};
        Estudante[] alunos2 = {estudante5, estudante2};
        Estudante[] alunos3 = {estudante1, estudante2, estudante3, estudante4, estudante5};

        Disciplina disciplina1 = new Disciplina("Cálculo I", 180.0);
        Disciplina disciplina2 = new Disciplina("Introdução à Programação", 230.5);
        Disciplina disciplina3 = new Disciplina("Algoritmo e Estrutura de Dados I", 200.0);

        Disciplina[] grade1 = {disciplina1, disciplina2};
        Disciplina[] grade2 = {disciplina2, disciplina3};
        Disciplina[] grade3 = {disciplina1, disciplina2, disciplina3};

        Turma turma1 = new Turma("9º Ano", 'A', alunos1, grade1);
        Turma turma2 = new Turma("8º Ano", 'B', alunos2, grade2);
        Turma turma3 = new Turma("Extra", 'I', alunos3, grade3);

        System.out.println(turma1);
        System.out.println(turma2);
        System.out.println(turma3);
    }
}
