package com.module6.aula7.exercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.TreeMap;

@SpringBootApplication
@RestController
public class Exercicio1Application {
    private static TreeMap<Integer, String> numeralsMap = new TreeMap<Integer, String>();

    static {
        numeralsMap.put(1000, "M");
        numeralsMap.put(900, "CM");
        numeralsMap.put(500, "D");
        numeralsMap.put(400, "CD");
        numeralsMap.put(100, "C");
        numeralsMap.put(90, "XC");
        numeralsMap.put(50, "L");
        numeralsMap.put(40, "XL");
        numeralsMap.put(10, "X");
        numeralsMap.put(9, "IX");
        numeralsMap.put(5, "V");
        numeralsMap.put(4, "IV");
        numeralsMap.put(1, "I");
    }

    public static void main(String[] args) {
        SpringApplication.run(Exercicio1Application.class, args);
    }

    @GetMapping("/romanNumeral")
    public String romanNumeral(@RequestParam(value = "digit", defaultValue = "1") int number) {
        String numeral = convertToRomanNumeral(number);

        return String.format("%d - %s", number, numeral);
    }

    private String convertToRomanNumeral(Integer number) {
        int mapKey =  numeralsMap.floorKey(number);

        if (number == mapKey)
            return numeralsMap.get(number);

        return numeralsMap.get(mapKey) + convertToRomanNumeral(number - mapKey);
    }
}
