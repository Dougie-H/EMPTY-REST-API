package kr.co.pcninc.ecoes.api.domain.dto;


import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class ResponseDto<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1458332012562409307L;

    @ApiParam(value = "통신 결과 코드", example = "200")
    private String code;
    @ApiParam(value = "통신 결과 메시지", example = "OK")
    private String message;
    @ApiParam(value = "리턴값")
    private T body;
}
