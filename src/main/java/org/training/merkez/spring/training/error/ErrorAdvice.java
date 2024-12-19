package org.training.merkez.spring.training.error;

import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class ErrorAdvice {
    private static final Logger logger = LoggerFactory.getLogger(ErrorAdvice.class);

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handle(IllegalArgumentException exp) {
        return ErrorObj.builder()
                       .withErrorDescParam(exp.getMessage())
                       .withErrorCodeParam(1022)
                       .build();
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<ErrorObj> handle(IllegalStateException exp) {
        return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
                             .body(ErrorObj.builder()
                                           .withErrorDescParam(exp.getMessage())
                                           .withErrorCodeParam(1023)
                                           .build());
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handle(MethodArgumentNotValidException exp) {
        return ErrorObj.builder()
                       .withErrorDescParam("validation error")
                       .withErrorCodeParam(1024)
                       .withErrorObjsParam(exp.getAllErrors()
                                              .stream()
                                              .map(se -> ErrorObj.builder()
                                                                 .withErrorDescParam(se.toString())
                                                                 .withErrorCodeParam(1027)
                                                                 .build())
                                              .collect(Collectors.toList()))
                       .build();
    }


    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handle(ConstraintViolationException exp) {
        return ErrorObj.builder()
                       .withErrorDescParam("validation error")
                       .withErrorCodeParam(1024)
                       .withErrorObjsParam(exp.getConstraintViolations()
                                              .stream()
                                              .map(se -> ErrorObj.builder()
                                                                 .withErrorDescParam(se.toString())
                                                                 .withErrorCodeParam(1027)
                                                                 .build())
                                              .collect(Collectors.toList()))
                       .build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorObj handle(Exception exp) {
        logger.error("[ErrorAdvice][handle]-> *Error* : " + exp.getMessage(),exp);
        return ErrorObj.builder()
                       .withErrorDescParam(exp.getMessage())
                       .withErrorCodeParam(5000)
                       .build();
    }

}
