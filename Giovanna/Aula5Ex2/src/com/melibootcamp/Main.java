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
        Precedente c1= new Celular("1234", "Emerson");
        Precedente c2= new Celular("32131", "Felipe");
        Precedente c3= new Celular("434343", "Julio");
        var celulares = new ArrayList<Precedente>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);
        var result = SortUtil.sort(pessoas.toArray(new Precedente[0]));
        var result2 = SortUtil.sort(celulares.toArray(new Precedente[0]));
    }

}
