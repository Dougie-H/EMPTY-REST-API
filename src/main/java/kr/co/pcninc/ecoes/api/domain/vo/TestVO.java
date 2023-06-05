package kr.co.pcninc.ecoes.api.domain.vo;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("TestVO")
public class TestVO {
    int count;
}
