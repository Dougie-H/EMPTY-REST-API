package com.dougie.api.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Builder
@Data
public class Example implements Serializable {
    @Serial
    private static final long serialVersionUID = -1393268690363386258L;

    private String exampleNo;
}
