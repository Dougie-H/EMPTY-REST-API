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

    /**
     * Empty Api.
     *
     * @param exampleNo param description
     * @return responseDto.SingleResponse<ExampleDto> Class
     */
    @ApiOperation(value = "tst", notes  = "테스트 입니다.")
    @ApiImplicitParam(name = "dtoParam", value = "param1 aaaaaaaaaaa", required = true)
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK.", response = ResponseDto.class),
            @ApiResponse(code = 300, message  = "DB Error."),
            @ApiResponse(code = 400, message  = "Page Not Found.")
    })
    @ResponseBody
    @GetMapping(CommonCode.UrlPath.EXAMPLE_PATH + "/{exampleNo}")
    public ResponseDto.SingleResponse<ExampleDto> hello(@PathVariable String exampleNo) {
        return new ResponseDto.SingleResponse(
                CommonCode.ResponseCodeAndMessage.SUCCESS,
                CommonCode.ResponseCodeAndMessage.SUCCESS_MSG,
                exampleService.getExample(exampleNo)
        );
    }
}
