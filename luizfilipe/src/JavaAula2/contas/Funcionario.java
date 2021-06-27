package JavaAula2.contas;

public abstract class Funcionario {
    double salario;
    
    public Funcionario(double salario) {
        this.salario = salario;
    }

    public void pagarSalario() {
        System.out.println("Pago salario no valor de " + salario);
    }
}
