package br.com.meli.ecommerce.exception.handler;

import br.com.meli.ecommerce.dto.ExceptionMessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionControllerAdviceHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ExceptionMessageDTO> defaultHandler(NoSuchElementException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ExceptionMessageDTO(e.getMessage(), HttpStatus.NOT_FOUND.value()));
    }

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<ExceptionMessageDTO> defaultHandler(HttpClientErrorException e) {
        return ResponseEntity
                .status(HttpStatus.UNAUTHORIZED)
                .body(new ExceptionMessageDTO(e.getMessage(), HttpStatus.UNAUTHORIZED.value()));
    }
}
