package tarde;

public abstract class Funcionario {
    private double salario;
    private int jornadaDeTrabalho;

    Funcionario(double salario, int jornadaDeTrabalho){
        this.salario = salario;
        this.jornadaDeTrabalho = jornadaDeTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getJornadaDeTrabalho() {
        return jornadaDeTrabalho;
    }

    public void setJornadaDeTrabalho(int jornadaDeTrabalho) {
        this.jornadaDeTrabalho = jornadaDeTrabalho;
    }
}
