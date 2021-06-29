package tarde;

public class RHhelper {
    public static void pagarSalario(Funcionario f){
        System.out.println("Pagando salario no valor de: " + f.getSalario());
    }

    public static void main(String[] args) {
        Funcionario tecnico = new Tecnico(3200,40);
        Funcionario analista = new Analista(4000,40, 4);
        Funcionario gerente = new Gerente(6000,36, 4);
        Funcionario diretor = new Diretor(15000);

        RHhelper.pagarSalario(tecnico);
        RHhelper.pagarSalario(analista);
        RHhelper.pagarSalario(gerente);
        RHhelper.pagarSalario(diretor);
    }
}
