package kr.co.pcninc.ecoes.api.controller;

import io.swagger.annotations.*;
import kr.co.pcninc.ecoes.api.common.ResponseAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    // 메서드 정보
    @ApiOperation(value = "tst", notes  = "테스트 입니다.")
    // Request Parameter 정보
    @ApiImplicitParams({
            @ApiImplicitParam(name = "param1", value = "param1 설명", required = true),
            @ApiImplicitParam(name = "param2", value = "param2 설명", required = true)
    })
    // Response 정보
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK.", response = ResponseAPI.class),
            @ApiResponse(code = 300, message  = "DB Error."),
            @ApiResponse(code = 400, message  = "Page Not Found.")
    })
    @ResponseBody
    @GetMapping("/test")
    public ResponseAPI test(@RequestParam(name = "param1") String param1,
                            @RequestParam(name = "param2") int param2) {

        ResponseAPI responseAPI = new ResponseAPI();

        responseAPI.setCode(200);
        responseAPI.setMessage("abc");

        Map<String, Object> result = new HashMap<>();
        result.put("param1", param1);
        result.put("param2", param2);

        responseAPI.setBody(result);

        return responseAPI;
    }
}
