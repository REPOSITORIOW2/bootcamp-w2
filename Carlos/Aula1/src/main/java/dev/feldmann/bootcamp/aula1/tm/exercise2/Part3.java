package dev.feldmann.bootcamp.aula1.tm.exercise2;

import java.util.Scanner;

public class Part3 {

    private static class Order {
        private String name;
        private double pricePerUnit;
        private int amount;

        public Order(String name, double pricePerUnit, int amount) {
            this.name = name;
            this.pricePerUnit = pricePerUnit;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return String.format("%s\nPreço Unidade: R$%.2f\nQuantidade: %d", name, pricePerUnit, amount);
        }

        public double getTotalPrice() {
            return pricePerUnit * amount;
        }
    }

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var orders = new Order[3];
        double total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Lendo informação do " + (i + 1) + "º produto");
            System.out.println("Informe o nome:");
            String name = scanner.nextLine();

            System.out.println("Informe o valor unitário:");

            Double pricePerUnit;
            do {
                pricePerUnit = readLineAsDouble(scanner);
                if (pricePerUnit == null) {
                    System.out.println("Informe um valor válido! Exemplo 42,2: ");
                }
            } while (pricePerUnit == null);


            System.out.println("Informe a quantidade:");
            Integer amount;
            do {
                amount = readLineAsInt(scanner);
                if (amount == null) {
                    System.out.println("Informe um valor válido! Exemplo 3: ");
                }
            } while (amount == null);


            orders[i] = new Order(name, pricePerUnit, amount);
            total += orders[i].getTotalPrice();
        }


        for (int i = 0; i < orders.length; i++) {
            System.out.println("Produto " + (i + 1));
            System.out.println(orders[i]);
            System.out.println();
        }

        System.out.println("Valor total: " + total);
    }



    private static Double readLineAsDouble(Scanner scanner) {
        try {
            var rawValue = scanner.nextLine().replace(",", ".");
            return Double.valueOf(rawValue);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private static Integer readLineAsInt(Scanner scanner) {
        try {
            var rawValue = scanner.nextLine().replace(",", ".");
            return Integer.valueOf(rawValue);
        } catch (NumberFormatException ex) {
            return null;
        }
    }
}
