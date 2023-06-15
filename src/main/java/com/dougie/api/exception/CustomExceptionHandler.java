package com.dougie.api.exception;

import com.dougie.api.model.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RequiredArgsConstructor
@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(CNotFoundDataException.ExampleNotFoundException.class)
    protected ResponseDto.CommonResponse exampleNotFoundException(CNotFoundDataException.ExampleNotFoundException e) {
        return new ResponseDto.CommonResponse("9999", "Example Not Found. ExampleNo : " + e.getExampleNo());
    }

    @ExceptionHandler(TooManyResultsException.class)
    protected ResponseDto.CommonResponse tooManyResultsException() {
        return new ResponseDto.CommonResponse("9999", "Too Many Result. ExampleNo");
    }
}
