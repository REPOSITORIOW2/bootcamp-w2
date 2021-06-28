package Exercicio5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    private GregorianCalendar gregorianCalendar;
    private Date dataAtual;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Data() {}

    public Data(Date data) {
        this.gregorianCalendar = new GregorianCalendar();
        this.gregorianCalendar.setTime(data);
        this.dataAtual = this.gregorianCalendar.getTime();
    }

    public Data(String data) {
        try {
            this.gregorianCalendar = new GregorianCalendar();
            this.gregorianCalendar.setTime(format.parse(data));
            this.dataAtual = this.gregorianCalendar.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void adicionarDia() {
        adicionar(1, Calendar.DAY_OF_MONTH);
    }

    private void adicionar(int quantidade, int tipo) {
        gregorianCalendar.add(tipo, quantidade);
        this.dataAtual = gregorianCalendar.getTime();
    }

    public static boolean verificaSeDataExiste(String data) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.setLenient(false);
            format.parse(data);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    @Override
    public String toString() {
        return format.format(this.dataAtual);
    }
}
