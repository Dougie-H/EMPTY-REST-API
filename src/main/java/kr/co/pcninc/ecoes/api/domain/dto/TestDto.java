package kr.co.pcninc.ecoes.api.domain.dto;

import io.swagger.annotations.ApiParam;
import kr.co.pcninc.ecoes.api.domain.entity.TestEntity;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Data
public class TestDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 7821603643050176345L;

    private int dtoParam1;
    private String dtoParam2;

    public TestEntity toEntity() {
        return TestEntity.builder()
                .param1(this.dtoParam1)
                .param2(this.dtoParam2)
                .build();
    }

    public static TestDto fromEntity(TestEntity testEntity) {
        return TestDto.builder()
                .dtoParam1(testEntity.getParam1())
                .dtoParam2(testEntity.getParam2())
                .build();
    }
}
