package com.dougie.api.service;

import com.dougie.api.exception.CNotFoundDataException;
import com.dougie.api.model.ExampleDto;
import com.dougie.api.repository.ExampleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    private static final Logger logger = LoggerFactory.getLogger(ExampleService.class);

    @Autowired
    private ExampleRepository exampleRepository;

    public ExampleDto getExample(String exampleNo) {
        return ExampleDto.fromEntity(exampleRepository.findByExampleNo(exampleNo)
                .orElseThrow(() -> new CNotFoundDataException.ExampleNotFoundException(exampleNo))
        );
    }
}
