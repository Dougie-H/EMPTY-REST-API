package kr.co.pcninc.ecoes.api.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Data
public class TestEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -1393268690363386258L;

    private int param1;
    private String param2;
}
