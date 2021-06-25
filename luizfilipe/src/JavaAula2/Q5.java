package JavaAula2;

import JavaAula2.ensino.Data;

public class Q5 {
    public static void main(String[] args) {
        Data nova = new Data(31, 1, 2021);

        System.out.println(nova);

        nova.addDia();

        System.out.println(nova);
    }
}
