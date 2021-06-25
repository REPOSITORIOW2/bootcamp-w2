package poo.aulaum.tt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class RadixSort {
    /*
   Ok Atribuir os valores de iArr[] para String sArr[].

   Ok Completar sArr[] com 0 (zeros) à esquerda (coincidindo com o número de dígitos do maior número de iArr[]).

   Ok  Criar 10 listas inicialmente vazias. L0 (será a lista para colocar os números que terminam com 0 (zero), em L1 colocaremos os números que terminam com 1, e assim por diante até L9.

        Percorrer sArr[] para cada elemento, verificar qual é o seu último dígito e adicionar à lista L0, L1, L2, … até L9 correspondente (conforme passo 3).


     */
    public static void radixSort(int[] iArr) {
        var sArr = new String[iArr.length];
        var maiorNumero = 0;
        for (int i = 0; i < iArr.length; i++) {
            var nString = Integer.toString(iArr[i]);
            sArr[i] = nString;

            if (nString.length() > maiorNumero) {
                maiorNumero = nString.length();
            }
        }

        var stringArray = new ArrayList<String>();
        for (String s : sArr) {
            stringArray.add(padLeftZeros(s, maiorNumero));
        }

        var digitCounter = maiorNumero - 1;
        while (digitCounter >= 0) {
            List<ArrayList<String>> listasDeL = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                listasDeL.add(new ArrayList<>());
            }

            for (String sNum : stringArray) {
                var indiceL = Integer.parseInt(getDigitOnPosition(digitCounter, sNum));
                var arrayL = (ArrayList<String>) listasDeL.get(indiceL);
                arrayL.add(sNum);
            }

            digitCounter--;

            var newArr = new ArrayList<String>();
            for (ArrayList<String> listaL : listasDeL) {
                newArr.addAll(listaL);
            }

            stringArray = newArr;
        }

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(stringArray.get(i));
        }
    }

    public static String padLeftZeros(String inputString, int length) {
        return String.format("%1$" + length + "s", inputString).replace(' ', '0');
    }

    public static String getDigitOnPosition(int position, String stringDigit) {
        return String.valueOf(stringDigit.charAt(position));
    }

    public static void main(String[] args) {
        int[] iArr = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i : iArr) {
            System.out.println(i + " ");
        }
    }
}
