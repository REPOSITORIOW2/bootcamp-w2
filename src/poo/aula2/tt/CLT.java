package poo.aula2.tt;

import java.util.Date;

abstract class CLT extends Funcionario implements Salario {

    private String cpf;
    private int descansoRemunerado;
    private Double bonificacao;
    private boolean metaBatida;

    public CLT(Funcionario funcionario, String cpf, int descansoRemunerado, Double bonificacao, boolean metaBatida) {
        super(funcionario.getSexo(),
                funcionario.getJornada(),
                funcionario.getRemuneracao(),
                funcionario.getNome(),
                funcionario.getNascimento());
        this.cpf = cpf;
        this.descansoRemunerado = descansoRemunerado;
        this.bonificacao = bonificacao;
        this.metaBatida = metaBatida;
    }

    public boolean isMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(boolean metaBatida) {
        this.metaBatida = metaBatida;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDescansoRemunerado() {
        return descansoRemunerado;
    }

    public void setDescansoRemunerado(int descansoRemunerado) {
        this.descansoRemunerado = descansoRemunerado;
    }

    @Override
    public String toString() {
        return "CLT{" +
                "cpf='" + cpf + '\'' +
                ", descansoRemunerado=" + descansoRemunerado +
                ", bonificacao=" + bonificacao +
                ", metaBatida=" + metaBatida +
                "} " + super.toString();
    }
}
