package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("30/06/2021");

        System.out.println(data);

        data.adicionarDia();

        System.out.println(data);

        System.out.println(Data.verificaSeDataExiste("55/02/2022"));
    }
}
