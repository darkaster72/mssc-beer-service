package io.github.darkaster72.mssc_beer_service.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class MvcExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<List<String>> validationErrorHandler(MethodArgumentNotValidException e) {
        var errorList = e.getFieldErrors().stream()
                .map(v -> v.getField() + " : " + v.getDefaultMessage())
                .collect(Collectors.toList());
        return ResponseEntity.badRequest().body(errorList);
    }
}
