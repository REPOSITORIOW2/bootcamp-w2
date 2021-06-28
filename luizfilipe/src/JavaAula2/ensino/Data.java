package JavaAula2.ensino;

import java.util.GregorianCalendar;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void addDia() {
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dia + 1 > meses[(mes - 1)]) {
            dia = 1;
            mes += 1;
        } else {
            dia += 1;
        }
    }

    @Override
    public String toString() {
        return "Data [ano=" + ano + ", dia=" + dia + ", mes=" + mes + "]";
    }

    


    
}
