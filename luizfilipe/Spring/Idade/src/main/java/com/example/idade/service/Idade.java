package com.example.idade.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class Idade {

    public static Integer calcYear(int dia, int mes, int ano) {
        var userYear = LocalDate.of(ano, mes, dia);

        return Period.between(userYear, LocalDate.now()).getYears();
    }
}
