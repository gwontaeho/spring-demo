package com.example.demo.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.test.model.Test;
import java.util.List;

@Mapper
public interface TestMapper {
    List<Test> getAllTests();
}
