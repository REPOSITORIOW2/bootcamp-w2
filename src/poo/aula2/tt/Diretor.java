package poo.aula2.tt;

class Diretor extends CLT {

    private double lucros;

    public Diretor(Funcionario funcionario, String cpf, int descansoRemunerado, Double bonificacao, boolean metaBatida, double lucros) {
        super(funcionario, cpf, descansoRemunerado, bonificacao, metaBatida);
        this.lucros = lucros;
    }

    public double getLucros() {
        return lucros;
    }

    public void setLucros(double lucros) {
        this.lucros = lucros;
    }

    @Override
    public void pagarSalario() {
        double salarioBase = super.getRemuneracao();
        double salarioRecebido = salarioBase+(0.03*this.lucros);
        System.out.println(super.getNome()+" recebeu: "+salarioRecebido);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "lucros=" + lucros +
                "} " + super.toString();
    }
}
