package poo.aula2.tm.exercicio2.list.exercicio5;

/*
Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados, métodos de acesso e o método toString, conforme explicamos no exercício anterior, um método para verificar se a data está correta e outro para adicionar um dia ao valor atual da data.
A classe GregorianCalendar deve ser investigada e usada para implementar os construtores e métodos Date.
 */
public class Main {
    public static void main(String[] args) {
        var data = new Data(40,20, 2020);
//        data.calendar.
//        System.out.println(data.calendar);
        System.out.println(data.getDia());
        System.out.println(data.getMes());
        System.out.println(data.getAno());

        System.out.println(data);
    }
}
