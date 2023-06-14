package com.dougie.api.repository;

import com.dougie.api.entity.Example;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExampleRepository {
    Optional<Example> findByExampleNo(String exampleNo);
}
