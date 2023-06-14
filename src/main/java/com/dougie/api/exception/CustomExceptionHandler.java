package com.dougie.api.exception;

import com.dougie.api.model.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RequiredArgsConstructor
@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(ExampleNotFoundException.class)
    protected ResponseDto.CommonResponse exampleNotFoundException(ExampleNotFoundException e) {
        return new ResponseDto.CommonResponse("9999", "Example Not Found. ExampleNo : " + e.getExampleNo());
    }
}
