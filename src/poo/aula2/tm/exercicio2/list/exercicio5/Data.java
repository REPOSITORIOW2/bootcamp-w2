package poo.aula2.tm.exercicio2.list.exercicio5;

import java.util.GregorianCalendar;

/*
Crie uma classe Data. A classe conterá, além dos construtores que você considera apropriados, métodos de acesso e o método toString,
 conforme explicamos no exercício anterior, um método para verificar se a data está correta e outro para adicionar um dia ao valor atual da data.
  A classe GregorianCalendar deve ser investigada e usada para implementar os construtores e métodos Date.
 */
public class Data {

    public GregorianCalendar calendar;

    public Data(int dia, int mes, int ano) {
      calendar = new GregorianCalendar();
      calendar.set(ano, mes, dia);
    }

    public int getDia(){
       return calendar.get(3);
    }

    public int getMes(){
        return calendar.get(2);
    }

    public int getAno(){
        return calendar.get(1);
    }

}
