package poo.aula2.tt;

class Gerente extends CLT {

    public Gerente(Funcionario funcionario, String cpf, int descansoRemunerado, Double bonificacao, boolean metaBatida) {
        super(funcionario, cpf, descansoRemunerado, bonificacao, metaBatida);
    }

    @Override
    public void pagarSalario() {
        double salarioBase = super.getRemuneracao();
        boolean metaBatida = super.isMetaBatida();
        double bonificacao = super.getBonificacao();
        double salarioRecebido = metaBatida ? (salarioBase*bonificacao) : salarioBase;
        System.out.println(super.getNome()+" recebeu: "+salarioRecebido);
    }

    @Override
    public String toString() {
        return "Gerente{} " + super.toString();
    }
}
