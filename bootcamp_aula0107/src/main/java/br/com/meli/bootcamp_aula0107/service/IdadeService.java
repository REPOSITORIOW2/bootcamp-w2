package br.com.meli.bootcamp_aula0107.service;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

@Service
public class IdadeService {

    public Integer calcularIdade(Integer dia, Integer mes, Integer ano) {
        Calendar calendarAgora = Calendar.getInstance();
        Calendar calendarNascimento = Calendar.getInstance();

        calendarNascimento.set(Calendar.YEAR, ano);
        calendarNascimento.set(Calendar.MONTH, mes + 1);
        calendarNascimento.set(Calendar.DAY_OF_MONTH, dia);

        long msPassados = calendarAgora.getTimeInMillis() - calendarNascimento.getTimeInMillis();
        long diasPassados = TimeUnit.MILLISECONDS.toDays(msPassados);
        long anosPassados = diasPassados / 365;

        return (int)anosPassados;
    }

}
