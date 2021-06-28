package poo.aula2.tt;

/*

Você recebeu a solicitação para desenvolver um sistema de gerenciamento de funcionários em uma empresa.
        Pela escala hierárquica temos dois tipos de funcionários, CLT e PJ.
        Funcionários PJ são prestadores de serviços e recebem por hora trabalhada.
        Funcionários CLT recebem de acordo com o cargo que ocupam na empresa
        + Bônus e gratificações que são calculados em porcentagem do salário base.
        Em geral Funcionários CLT são divididos na seguinte hierarquia:
        Técnicos, analistas, gerentes e diretores

        a) Técnicos recebem bonificação de 5% por meta batida, trabalham uma jornada de 40h semanais
        e não têm descanso semanal remunerado. O salário base de um técnico é de R$ 3.200.

        b) Analistas possuem bonificação de 8% por meta batida, trabalham uma jornada de 40h horas semanais e
        possuem 4h de descanso semanal remunerado. O salário base de um analista é de R$ 4.000

        c) Gerentes possuem bonificação de 12,5% por meta batida, trabalham 36h semanais com 4h de descanso semanal remunerado.
        O salário base de um gerente é de R$ 6.000.

        d) Diretores não possuem bonificação, entretanto recebem participação nos lucros de 3%,
        não possuem horário de trabalho definido e seu salário base é de R$ 15.000.

Você precisa implementar o método pagarSalario para cada categoria de forma a considerar
as especificidades de cada uma.
        */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exercicio4 {

    public static void main(String[] args) {

        List<CLT> listaClt = new ArrayList<>();

        Funcionario f1 = new Funcionario('M',
                40,
                3200.0,
                "Marcelo",
                new Date(1998,05,13));
        Funcionario f2 = new Funcionario('M',
                40,
                4000.0,
                "Nathan",
                new Date(1996,06,22));
        Funcionario f3 = new Funcionario('F',
                36,
                6000.0,
                "Miria",
                new Date(1995,01,12));
        Funcionario f4 = new Funcionario('M',
                0,
                15000.0,
                "Victor",
                new Date(1997,02,21));

        listaClt.add(new Tecnico(f1,
                "14890178712",
                0,
                1.05,
                true));

        listaClt.add(new Analista(f2,
                "46478378712",
                4,
                1.08,
                false));

        listaClt.add(new Gerente(f3,
                "03478111234",
                4,
                1.12,
                true));

        listaClt.add(new Diretor(f4,
                "03478111234",
                0,
                0.0,
                false,
                100000));

        listaClt.forEach(Salario::pagarSalario);

    }


}

