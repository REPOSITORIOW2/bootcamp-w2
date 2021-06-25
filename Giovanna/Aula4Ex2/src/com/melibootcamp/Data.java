package com.melibootcamp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {
    private int ano;
    private int mes;
    private int dia;
    private Calendar data;

    final static String DATE_FORMAT = "dd-MM-yyyy";

    public Data() {
    }

    public Calendar getData() {
        return data;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public static String getDateFormat() {
        return DATE_FORMAT;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Data(int ano, int mes, int dia) {
            this.ano = ano;
            this.mes = mes;
            this.dia = dia;
            this.data= new GregorianCalendar(ano, mes, dia);

    }
    public String adicionaUmdia(){
        this.data.add(Calendar.DAY_OF_MONTH, 1);

        return String.valueOf(this.data);
    }
    public boolean verificaSeDataExiste(){
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.parse(String.valueOf(this.data));
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
