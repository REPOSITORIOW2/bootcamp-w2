package dev.feldmann.bootcamp.modulo6.Aula1.services.romanNumbersConverter;

import org.springframework.stereotype.Service;

@Service
public class RomanNumberConverterService implements IRomanNumberConverterService {

    @Override
    public String convertToRomanNumber(Integer number) {
        StringBuilder builder = new StringBuilder();

        int currentNumber = number;
        while (currentNumber > 0) {
            var top = RomanCharacter.getTop(currentNumber);
            if (top == null) {
                break;
            }
            builder.append(top.name());
            currentNumber -= top.getValue();
        }

        return builder.toString();
    }
}
