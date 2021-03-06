package com.dh.meli.spring02.handler;

import com.dh.meli.spring02.exception.NotFoundException;
import com.dh.meli.spring02.exception.NotFoundExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class NotFoundExHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundExceptionDetails> handlerNotFoundEx(NotFoundException ex) {
        return new ResponseEntity<NotFoundExceptionDetails>(
                NotFoundExceptionDetails.builder()
                        .titulo("Objeto não encontrado")
                        .status(HttpStatus.NOT_FOUND.value())
                        .mensagem(ex.getMessage())
                        .timestamp(LocalDateTime.now())
                        .build(),
                HttpStatus.NOT_FOUND);
    }
}
