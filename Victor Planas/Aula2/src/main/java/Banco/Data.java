package Banco;

import java.util.GregorianCalendar;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private GregorianCalendar gc;

    Data(int dia, int mes, int ano) {
        this.gc = new GregorianCalendar();
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        gc.add((GregorianCalendar.DAY_OF_MONTH), dia);
        gc.add((GregorianCalendar.MONTH), mes);
        gc.add((GregorianCalendar.YEAR), ano);
    }

    public boolean verificaData(GregorianCalendar gc) {
        try {
            gc.getTime();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void insereDia(int dia){
        gc.set((GregorianCalendar.DAY_OF_MONTH), dia);
        this.dia = dia;
    }
    public void insereMes(){
        gc.set((GregorianCalendar.MONTH), dia);
        this.mes = mes;
    }
    public void insereAno(){
        gc.set((GregorianCalendar.YEAR), dia);
        this.ano = ano;
    }

    @Override
    public String toString(){
        return dia+"/"+mes+"/"+ano;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }
}
