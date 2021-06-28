package com.meli.aula02.tt.exercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Utilidade {

    public static OptionalDouble areaMedia (List<GeometricFigure> arr){
        return arr.stream().mapToDouble(GeometricFigure::area).average();

    }

}
