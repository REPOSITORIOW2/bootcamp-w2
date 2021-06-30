package br.com.mercadolivre.romanos;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class NumeroRomano {

    private static final int[] DECIMAIS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convertDecimal(int nbr) {
        StringBuilder resultado = new StringBuilder();
        for(int i = 0; i<DECIMAIS.length; i++) {
            int parteInteira = nbr/DECIMAIS[i];
            nbr -= DECIMAIS[i] * parteInteira;
            resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
        }
        return resultado.toString();
    }
}
