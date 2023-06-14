package com.dougie.api.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExampleNotFoundException extends RuntimeException {
    private String exampleNo;

    public ExampleNotFoundException(String exampleNo) {
        this.exampleNo = exampleNo;
    }
}
