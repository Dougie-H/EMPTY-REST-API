package com.dougie.api.model;


import io.swagger.annotations.ApiParam;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

public class ResponseDto<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1458332012562409307L;

    @Setter
    public static class CommonResponse {
        @ApiParam(value = "응답 코드")
        private String code;

        @ApiParam(value = "응답 메시지")
        private String message;

        public CommonResponse(String code, String message) {
            this.code = code;
            this.message = message;
        }
    }

    @Setter
    public static class SingleResponse<T> extends CommonResponse {
        @ApiParam(value = "결과 데이터")
        private T data;

        public SingleResponse(String code, String message, T data) {
            super(code, message);
            setData(data);
        }
    }
}
