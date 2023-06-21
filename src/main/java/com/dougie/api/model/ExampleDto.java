package com.dougie.api.model;

import com.dougie.api.entity.Example;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

@Builder
@Data
public class ExampleDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 7821603643050176345L;

    private String exampleNo;

    @NotNull(message = "exampleParam1 항목은 필수값 입니다.")
    private String exampleParam1;

    private String exampleParam2;

    public Example toEntity() {
        return Example.builder()
                .exampleNo(this.exampleNo)
                .exampleParam1(this.exampleParam1)
                .exampleParam2(this.exampleParam2)
                .build();
    }

    public static ExampleDto fromEntity(Example testEntity) {
        return ExampleDto.builder()
                .exampleNo(testEntity.getExampleNo())
                .exampleParam1(testEntity.getExampleParam1())
                .exampleParam2(testEntity.getExampleParam2())
                .build();
    }
}
