package Ex01_tm;

import java.util.ArrayList;

public class Turma {

   private ArrayList<Disciplina> disciplinas;
   private ArrayList<Estudante> estudantes;
   private String turmaSerie;
   private String identificador;

   public Turma(String turmaSerie, String identificador) {
      this.disciplinas = new ArrayList<Disciplina>();
      this.estudantes = new ArrayList<Estudante>();
      this.turmaSerie = turmaSerie;
      this.identificador = identificador;
   }

   public ArrayList<Disciplina> getDisciplinas() {
      return disciplinas;
   }

   public void setDisciplinas(Disciplina disciplina) {
      this.disciplinas.add(disciplina);
   }

   public ArrayList<Estudante> getEstudantes() {
      return estudantes;
   }

   public void setEstudantes(Estudante estudante) {
      if(estudante.getSerie().equals(this.turmaSerie))
         this.estudantes.add(estudante);
      else
         System.out.println("Erro: A série do estudante precisa ser igual à série da turma");
   }

   public String getTurmaSerie() {
      return turmaSerie;
   }

   public String getIdentificador() {
      return identificador;
   }

   public String getTodasDisciplinas(){
      String todasDisciplinas = "";
      for (Disciplina disc: disciplinas){
         todasDisciplinas += disc.getNome() + " ";
      }
      return todasDisciplinas;
   }

   public String getTodosEstudantes() {
      String todosEstudantes = "";
      for (Estudante est : estudantes) {
         todosEstudantes += est.getNome() + " ";
      }
      return todosEstudantes;
   }

   @Override
   public String toString() {
      return "Turma{" +
              "disciplinas=" + getTodasDisciplinas() +
              ", estudantes=" + getTodosEstudantes() +
              ", turmaSerie='" + turmaSerie + '\'' +
              ", identificador='" + identificador + '\'' +
              '}';
   }
}
