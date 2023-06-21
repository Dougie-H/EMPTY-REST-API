package com.dougie.api.exception;

import com.dougie.api.common.CommonCode;
import com.dougie.api.model.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.NoHandlerFoundException;

@RequiredArgsConstructor
@RestControllerAdvice
public class CustomExceptionHandler {

    private CommonCode.ResponseCodeAndMessage codeAndMessage;

    /**
     * 404 공통 에러 Exception 처리
     * @return
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    protected ResponseDto.CommonResponse NotFoundException() {
        return new ResponseDto.CommonResponse(codeAndMessage.NOT_FOUND, codeAndMessage.NOT_FOUND_MSG);
    }

    /**
     * Request 필수 변수 누락 시
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseDto.CommonResponse methodArgumentNotValidException(MethodArgumentNotValidException e) {
        return new ResponseDto.CommonResponse(codeAndMessage.BAD_REQUEST, e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

    @ExceptionHandler(CNotFoundDataException.ExampleNotFoundException.class)
    protected ResponseDto.CommonResponse exampleNotFoundException(CNotFoundDataException.ExampleNotFoundException e) {
        return new ResponseDto.CommonResponse("9999", "Example Not Found. ExampleNo : " + e.getExampleNo());
    }

    @ExceptionHandler(TooManyResultsException.class)
    protected ResponseDto.CommonResponse tooManyResultsException() {
        return new ResponseDto.CommonResponse("9999", "Too Many Result. ExampleNo");
    }


}
