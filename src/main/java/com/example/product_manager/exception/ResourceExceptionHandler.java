package com.example.product_manager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {

        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não Encontrado", e.getMessage(), request.getRequestURI());
        
        return ResponseEntity.status(status).body(err);
    }

   @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandardError> validationError(MethodArgumentNotValidException e, HttpServletRequest request) {
        
        HttpStatus status = HttpStatus.BAD_REQUEST;
        String mensagemErro = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();

        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Erro de Validação do Corpo", mensagemErro, request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
