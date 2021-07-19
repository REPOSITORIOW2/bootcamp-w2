package com.module6.class8.api.agecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.GregorianCalendar;

@SpringBootApplication
@RestController
public class AgecalculatorApplication {
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        SpringApplication.run(AgecalculatorApplication.class, args);
    }

    @GetMapping("/{day}/{month}/{year}/")
    public String ageCalculator(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        LocalDate date = LocalDate.of(year, month, day);
        Period period = Period.between(date, LocalDate.now());

        return String.valueOf(period.getYears());
    }
}
