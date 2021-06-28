package com.melibootcamp;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Precedente p1= new Pessoa("Ana", "1234");
        Precedente p2= new Pessoa("Juna", "1234");
        Precedente p3= new Pessoa("Aana", "1234");
        var pessoas = new ArrayList<Precedente>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        var result = SortUtil.sort(pessoas.toArray(new Precedente[0]));
    }

}
