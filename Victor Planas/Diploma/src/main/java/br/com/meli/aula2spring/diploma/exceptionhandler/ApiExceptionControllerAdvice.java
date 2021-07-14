package br.com.meli.aula2spring.diploma.exceptionhandler;

import br.com.meli.aula2spring.diploma.dtos.exception.ErrorDTO;
import br.com.meli.aula2spring.diploma.dtos.exception.ValidationErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolationException;


@ControllerAdvice
public class ApiExceptionControllerAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ValidationErrorDTO handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        ValidationErrorDTO errors = new ValidationErrorDTO("Invalid input in body");
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.addError(fieldName, errorMessage);
        });
        return errors;
    }
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public ValidationErrorDTO handleValidationExceptionsBody(
            ConstraintViolationException ex) {
        ValidationErrorDTO errors = new ValidationErrorDTO("Invalid input in url");
        ex.getConstraintViolations().forEach(error -> {
            String fieldName = error.getPropertyPath().toString();
            String errorMessage = error.getMessage();
            errors.addError(fieldName,errorMessage);
        });
        return errors;
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorDTO handleParseJsonExceptions(
            HttpMessageNotReadableException ex) {

        return new ErrorDTO("Error parsing Json");
    }
}
