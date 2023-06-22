package com.dougie.api.controller;

import com.dougie.api.common.CommonCode;
import com.dougie.api.model.ResponseDto;
import com.dougie.api.model.UserDto;
import com.dougie.api.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private CommonCode.ResponseCodeAndMessage codeAndMessage;

    /**
     * user Api.
     *
     * @param usrNo param description
     * @return responseDto.SingleResponse<UserDto> Class
     */
    @ApiOperation(value = "User API Request", notes  = "예제 API Request 입니다.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "요청이 완료 되었습니다.", response = ResponseDto.SingleResponse.class),
            @ApiResponse(code = 400, message = "정상적인 요청이 아닙니다."),
            @ApiResponse(code = 403, message = "접근 권한이 없는 요청 입니다."),
            @ApiResponse(code = 500, message = "알 수 없는 오류가 발생 하였습니다. 관리자에게 문의 바랍니다.")
    })
    @ResponseBody
    @GetMapping(CommonCode.UrlPath.USER_GET_PATH)
    public ResponseDto.SingleResponse<UserDto> findUser(@PathVariable(name = "usrNo") String usrNo) {
        return new ResponseDto.SingleResponse(codeAndMessage.SUCCESS, codeAndMessage.SUCCESS_MSG, userService.findUser(usrNo));
    }

    /**
     * Post Request
     */
    @ResponseBody
    @PostMapping(CommonCode.UrlPath.USER_PATH)
    public ResponseDto.CommonResponse postExample(@RequestBody @Valid UserDto user) {
        /*
         * 로직 추가 필요
         */
        return new ResponseDto.CommonResponse(codeAndMessage.SUCCESS_201, codeAndMessage.SUCCESS_MSG_201);
    }
}
