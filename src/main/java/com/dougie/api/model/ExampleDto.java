package com.dougie.api.model;

import com.dougie.api.entity.Example;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Data
public class ExampleDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 7821603643050176345L;

    private String exampleNo;

    public Example toEntity() {
        return Example.builder()
                .exampleNo(this.exampleNo)
                .build();
    }

    public static ExampleDto fromEntity(Example testEntity) {
        return ExampleDto.builder()
                .exampleNo(testEntity.getExampleNo())
                .build();
    }
}
