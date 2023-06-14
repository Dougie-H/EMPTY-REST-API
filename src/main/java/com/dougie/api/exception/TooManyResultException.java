package com.dougie.api.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TooManyResultException extends RuntimeException {
    private String exampleNo;
    public TooManyResultException(String exampleNo) {
        this.exampleNo = exampleNo;
    }
}
