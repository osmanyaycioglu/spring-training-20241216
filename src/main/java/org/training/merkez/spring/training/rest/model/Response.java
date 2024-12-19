package org.training.merkez.spring.training.rest.model;

import lombok.Data;
// Yapma
@Data
public class Response<T> {
    private boolean errorOccurred;
    private String errorDesc;
    private String errorCause;
    private Integer errorCode;
    private T data;
}
