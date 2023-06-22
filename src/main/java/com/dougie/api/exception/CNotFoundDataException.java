package com.dougie.api.exception;

import lombok.Getter;
import lombok.Setter;

public class CNotFoundDataException extends RuntimeException {

    @Getter
    @Setter
    public static class UserNotFoundException extends CNotFoundDataException {
        private String userNo;

        public UserNotFoundException(String userNo) {
            this.userNo = userNo;
        }
    }
}
