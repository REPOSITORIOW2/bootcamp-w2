package com.melibootcamp;

import java.util.Arrays;
import java.util.List;

public class UtilityClass {
    public static double areaMedia (List<GeometricFigure> arr){
        int sum = 0;
        for (GeometricFigure figure : arr) {
            sum += figure.getArea();
        }
        return sum/ arr.size();
    }
}
