package kr.co.pcninc.ecoes.api.domain.dto;

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

    private int param1;
    private String param2;

    public TestEntity toEntity() {
        return TestEntity.builder()
                .param1(this.param1)
                .param2(this.param2)
                .build();
    }

    public static TestDto fromEntity(TestEntity testEntity) {
        return TestDto.builder()
                .param1(testEntity.getParam1())
                .param2(testEntity.getParam2())
                .build();
    }
}
