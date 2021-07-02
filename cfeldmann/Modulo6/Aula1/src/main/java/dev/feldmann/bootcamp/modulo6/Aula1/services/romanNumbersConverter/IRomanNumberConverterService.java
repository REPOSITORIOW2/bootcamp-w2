package dev.feldmann.bootcamp.modulo6.Aula1.services.romanNumbersConverter;

import org.springframework.stereotype.Service;

@Service
public interface IRomanNumberConverterService {

     String convertToRomanNumber(Integer value);
}
