package com.dougie.api.controller;

import com.dougie.api.model.ResponseDto;
import com.dougie.api.service.ExampleService;
import io.swagger.annotations.*;
import com.dougie.api.common.CommonCode;
import com.dougie.api.model.ExampleDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Empty Api Form Class
 * 테스트용 API
 *
 * @author Dougie
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
public class ExampleController {
    private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    private final ExampleService exampleService;

    private CommonCode.ResponseCodeAndMessage codeAndMessage;

    /**
     * Empty Api.
     *
     * @param exampleNo param description
     * @return responseDto.SingleResponse<ExampleDto> Class
     */
    @ApiOperation(value = "예제 API Request", notes  = "예제 API Request 입니다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "요청이 완료 되었습니다.", response = ResponseDto.SingleResponse.class),
            @ApiResponse(code = 400, message = "정상적인 요청이 아닙니다."),
            @ApiResponse(code = 403, message = "접근 권한이 없는 요청 입니다."),
            @ApiResponse(code = 500, message = "알 수 없는 오류가 발생 하였습니다. 관리자에게 문의 바랍니다.")
    })
    @ResponseBody
    @GetMapping(CommonCode.UrlPath.EXAMPLE_GET_PATH)
    public ResponseDto.SingleResponse<ExampleDto> hello(@PathVariable(name = "exampleNo") String exampleNo) {
        assert exampleNo.length() > 0 : new ResponseDto.CommonResponse(codeAndMessage.BAD_REQUEST, codeAndMessage.BAD_REQUEST_MSG);
        return new ResponseDto.SingleResponse(codeAndMessage.SUCCESS, codeAndMessage.SUCCESS_MSG, exampleService.getExample(exampleNo));
    }

    /**
     * Post Request
     */
    @ResponseBody
    @PostMapping(CommonCode.UrlPath.EXAMPLE_PATH)
    public ResponseDto.CommonResponse postExample(@RequestBody @Valid ExampleDto example) {

        return new ResponseDto.CommonResponse(codeAndMessage.SUCCESS_201, codeAndMessage.SUCCESS_MSG_201);
    }

}
