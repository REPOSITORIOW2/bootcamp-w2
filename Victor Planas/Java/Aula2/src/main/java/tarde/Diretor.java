package tarde;

public class Diretor extends Funcionario{

    Diretor(double salario) {
        super(salario, 0);
    }

    public void participacaoNosLucros(double lucro, Funcionario f){
        f.setSalario(f.getSalario()+ 0.03*lucro);
    }

}
