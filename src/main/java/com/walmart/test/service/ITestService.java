package com.walmart.test.service;

import com.walmart.test.dto.TestRequestDTO;
import com.walmart.test.interfaces.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ITestService implements TestService {

    @Override
    public ResponseEntity<?> store(TestRequestDTO testRequestDTO) {
        List<String> arrayC = Stream.concat(testRequestDTO.getArrayA().stream(), testRequestDTO.getArrayB().stream()).collect(Collectors.toList());
        Map<Object, Long> groupByArrayC = arrayC.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        // Make a json
        Map<String, Object> response = new HashMap<>();
        response.put("count", groupByArrayC);
        return ResponseEntity.ok(response);
    }
}
