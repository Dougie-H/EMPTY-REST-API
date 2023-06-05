package kr.co.pcninc.ecoes.api.mappers;

import kr.co.pcninc.ecoes.api.domain.vo.TestVO;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
    TestVO getCount();
}
