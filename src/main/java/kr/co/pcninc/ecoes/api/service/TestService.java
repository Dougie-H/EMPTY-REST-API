package kr.co.pcninc.ecoes.api.service;

import kr.co.pcninc.ecoes.api.domain.vo.TestVO;
import kr.co.pcninc.ecoes.api.mappers.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public int selectCount() {
        TestVO t = testMapper.getCount();
        return t.getCount();
    }
}
