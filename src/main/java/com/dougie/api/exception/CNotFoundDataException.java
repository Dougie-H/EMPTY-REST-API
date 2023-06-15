package com.dougie.api.exception;

import lombok.Getter;
import lombok.Setter;

public class CNotFoundDataException extends RuntimeException {

    @Getter
    @Setter
    public static class ExampleNotFoundException extends CNotFoundDataException {
        private String exampleNo;

        public ExampleNotFoundException(String exampleNo) {
            this.exampleNo = exampleNo;
        }
    }
}
