package Ex02_tm.wincenty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    private GregorianCalendar gc;
    private Date dateToManipulate;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Data(String date) {
        try {
            this.gc = new GregorianCalendar();
            this.gc.setTime(formatter.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Data(int year, int month, int day) {
        this.gc = new GregorianCalendar(year, month, day);
    }

    public void adicionarDias(int amount) {
        this.gc.add(Calendar.DAY_OF_MONTH, amount);
    }

    @Override
    public String toString() {
        return formatter.format(gc.getTime());
    }
}
