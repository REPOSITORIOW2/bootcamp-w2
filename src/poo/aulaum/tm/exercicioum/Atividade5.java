package poo.aulaum.tm.exercicioum;

//Desenvolver um programa para exibição por console os n primeiros números naturais
// que têm pelo menos de m dígitos de d, sendo n, m e d valores que o utilizador vai enviar pelo console.
//Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir
// os primeiros 5 números naturais que tenham pelo menos 2 dígitos 3 no console. Neste caso, a saída será: 33, 133 , 233, 303, 313.
//Dependendo de como você decidir abordar a solução para este exercício,
// pode ser necessário usar recursos que ainda não estudamos. O desafio é pesquisar no Google como usar esses

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        long amountOfNaturalNumbers = scanner.nextLong();
        int amountofDigits = scanner.nextInt();
        int counter = 0;
        scanner.nextLine();
        String digit = scanner.nextLine();
        List<String> naturalNumbers = new ArrayList<>();

        double startingNumber = Math.pow(10,amountofDigits - 1); //comecando pelos numeros que satisfazem o numero de digitos minimos
        System.out.println(startingNumber);

        for (Double i = startingNumber; counter < amountOfNaturalNumbers; i++) {
            String numberAsString = i.toString();
            int digitMatchCounter = 0;
            if (numberAsString.contains(digit)) {
                String[] splittedNumber = numberAsString.split("");
                for (String numberDigit : splittedNumber) {
                    if (numberDigit.equals(digit)) {
                        digitMatchCounter++;
                    }
                }
            }
            if (digitMatchCounter >= amountofDigits) {
                naturalNumbers.add(numberAsString);
                counter++;
            }
        }
        System.out.println("Natural numbers: " + naturalNumbers);



    }
}
