package kr.co.pcninc.ecoes.api.common;


import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ResponseAPI<T> {
    @ApiParam(value = "통신 결과 코드", example = "200")
    private int code;
    @ApiParam(value = "통신 결과 메시지", example = "OK")
    private String message;
    @ApiParam(value = "리턴값")
    private T body;
}
