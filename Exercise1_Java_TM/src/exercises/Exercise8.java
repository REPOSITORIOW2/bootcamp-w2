package exercises;

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s\nR$%.2f\nQuantidade: %d", this.getName(), this.getPrice(), this.getQuantity());
    }
}

public class Exercise8 {
    public static void exec() {
        Scanner scan = new Scanner(in);
        List<Product> productList = new ArrayList<Product>();

        for(int i = 0; i < 3; i++) {
            out.print("Digite o nome do produto: ");
            String name = scan.nextLine();
            out.print("Digite o preço do produto: ");
            double price = scan.nextDouble();
            out.print("Digite a quantidade do produto: ");
            int quantity = scan.nextInt();
            scan.nextLine();

            Product pd = new Product(name, price, quantity);
            productList.add(pd);
        }

        int productCounter = 1;
        double valueSum = 0.0;

        for(Product p : productList) {
            out.println(String.format("Produto %d", productCounter));
            out.println(p.toString());
            out.println();

            valueSum += (p.getPrice() * p.getQuantity());
            productCounter++;
        }

        out.println(String.format("Valor Total: R$%.2f", valueSum));
    }
}
