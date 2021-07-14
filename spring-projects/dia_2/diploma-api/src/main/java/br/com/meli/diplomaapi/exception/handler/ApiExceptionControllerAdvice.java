package br.com.meli.diplomaapi.exception.handler;


import br.com.meli.diplomaapi.dto.ExceptionDTO;
import br.com.meli.diplomaapi.exception.ExceptionNotApproved;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@ControllerAdvice
public class ApiExceptionControllerAdvice {

    @ExceptionHandler(ExceptionNotApproved.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ExceptionDTO> defaultHandler(ExceptionNotApproved e) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(new ExceptionDTO(e.getMessage(), HttpStatus.CONFLICT.value()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionDTO> defaultHandler(HttpMessageNotReadableException e) {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ExceptionDTO("Corpo da requisição mal formatada, tipo invalido", HttpStatus.BAD_REQUEST.value()));
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ExceptionDTO> defaultHandler(NoSuchElementException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ExceptionDTO(e.getMessage(), HttpStatus.NOT_FOUND.value()));
    }
}
