package exercises;

import static java.lang.System.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Exercise7 {
    public static void exec() {
        double companyX = 1.13;
        double companyY = 18.4;
        GregorianCalendar gc = new GregorianCalendar(2021, 1, 1);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        while (companyX < companyY) {
            out.println(String.format("Empresa X - %s - Valor da empresa: %.2fm", df.format(gc.getTime()), companyX));
            out.println(String.format("Empresa Y - %s - Valor da empresa: %.2fm", df.format(gc.getTime()), companyY));

            companyX += companyX * 1.48;
            companyY += companyY * 0.32;
            gc.add(gc.YEAR, 1);
        }

        out.println(String.format("Empresa X - %s - Valor da empresa: %.3fm", df.format(gc.getTime()), companyX));
        out.println(String.format("Empresa Y - %s - Valor da empresa: %.3fm", df.format(gc.getTime()), companyY));
    }
}
