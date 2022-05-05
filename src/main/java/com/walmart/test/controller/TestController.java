package com.walmart.test.controller;

import com.walmart.test.dto.TestRequestDTO;
import com.walmart.test.interfaces.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/searchArray")
    public ResponseEntity<?> store(@RequestBody TestRequestDTO dto) {
        return this.testService.store(dto);
    }
}
