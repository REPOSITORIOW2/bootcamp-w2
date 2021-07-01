package com.bootcamp.calcularareacasa.services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class CalculadoraIdadeService {

    public static int calculaIdade(LocalDate dataDeNascimento, LocalDate dataAtual) {
        if ((dataDeNascimento != null) && (dataAtual != null)) {
            return Period.between(dataDeNascimento, dataAtual).getYears();
        } else {
            return 0;
        }
    }
}
