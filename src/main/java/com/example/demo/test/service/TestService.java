package com.example.demo.test.service;


import org.springframework.stereotype.Service;
import com.example.demo.test.mapper.TestMapper;
import com.example.demo.test.model.Test;

import java.util.List;


@Service
public class TestService {
    private final TestMapper testMapper;

    public TestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public List<Test> getAllTests() {
        return testMapper.getAllTests();
    }
}
