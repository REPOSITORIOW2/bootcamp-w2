package meli.bootcamp.spring.idade.model;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Data {
    private int day;
    private int month;
    private int year;
    public static final int FUTURE_DATE_ERR = -1;
    public static final int INVALID_DATE_ERR = -2;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int idade() {
        Period period;
        if (this.isValid()) {
            LocalDate date = LocalDate.of(this.year, this.month, this.day);
            period = Period.between(date, LocalDate.now());
            int years = period.getYears();
            if (years >= 0)
                return years;
            else
                return FUTURE_DATE_ERR;
        }
        return INVALID_DATE_ERR;
    }

    private boolean isValid() {
        try {
            LocalDate.parse(this.toString(), DateTimeFormatter.ofPattern("d[d]/M[M]/yyyy"));
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(this.day + "/" + this.month + "/" + this.year);
    }
}
