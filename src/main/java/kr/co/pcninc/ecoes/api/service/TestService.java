package kr.co.pcninc.ecoes.api.service;

import kr.co.pcninc.ecoes.api.domain.vo.TestVO;
import kr.co.pcninc.ecoes.api.mappers.TestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private TestMapper testMapper;

    public int selectCount() {
        TestVO t = testMapper.getCount();
        return t.getCount();
    }
}
