package kr.co.pcninc.ecoes.api.service.response;

import kr.co.pcninc.ecoes.api.domain.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ResponseService {
    public <T> ResponseDto<T> getSuccessResult(String code, String msg, T body) {
        ResponseDto response = new ResponseDto();

        response.setCode(code);
        response.setMessage(msg);
        response.setBody(body);

        return response;
    }

    public <T> ResponseDto<T> getSuccessResult(String code, String msg) {
        ResponseDto response = new ResponseDto();

        response.setCode(code);
        response.setMessage(msg);
        response.setBody("");

        return response;
    }
}
