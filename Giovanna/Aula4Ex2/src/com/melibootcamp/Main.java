package com.melibootcamp;

public class Main {

    public static void main(String[] args) {
	Data data = new Data(1999,5,13);
	data.adicionaUmdia();
	System.out.println(data.getData().getTime());
	System.out.println(data.verificaSeDataExiste());
    }

}
