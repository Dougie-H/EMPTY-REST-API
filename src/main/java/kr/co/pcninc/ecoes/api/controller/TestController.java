package kr.co.pcninc.ecoes.api.controller;

import io.swagger.annotations.*;
import kr.co.pcninc.ecoes.api.common.CommonCode;
import kr.co.pcninc.ecoes.api.domain.dto.ResponseDto;
import kr.co.pcninc.ecoes.api.domain.dto.TestDto;
import kr.co.pcninc.ecoes.api.service.TestService;
import kr.co.pcninc.ecoes.api.service.response.ResponseService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Empty Api Form Class
 * 테스트용 API
 *
 * @author 이재홍
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    private final TestService testService;
    private final ResponseService responseService;

    /**
     * Empty Api.
     *
     * @param param1 param description
     * @param param2 param description
     * @return responseDto Class
     */
    @ApiOperation(value = "tst", notes  = "테스트 입니다.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "param1", value = "param1 설명", required = true),
            @ApiImplicitParam(name = "param2", value = "param2 설명", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK.", response = ResponseDto.class),
            @ApiResponse(code = 300, message  = "DB Error."),
            @ApiResponse(code = 400, message  = "Page Not Found.")
    })
    @ResponseBody
    @GetMapping(CommonCode.UrlPath.TEST_PATH + "/hello")
    public ResponseDto test(@RequestParam(name = "param1") String param1,
                            @RequestParam(name = "param2") int param2,
                            @RequestBody TestDto dtoParam) {
        String code = CommonCode.Code.FAIL;
        String msg = CommonCode.Code.FAIL_MSG;

        Map<String, Object> result = new HashMap<>();

        try {
            int t = testService.selectCount();

            result.put("param1", param1);
            result.put("param2", param2);
            result.put("getCount", t);

            code = CommonCode.Code.SUCCESS;
            msg = CommonCode.Code.SUCCESS_MSG;

            LOGGER.info("param1 : [{}], param2: [{}], getCount: [{}]",
                    param1,
                    param2,
                    t);
        } catch (Exception e) {
            e.printStackTrace();

            LOGGER.info("param1 : [{}], param2: [{}]",
                    param1,
                    param2);
        }

        return responseService.getSuccessResult(code, msg, result);
    }
}
