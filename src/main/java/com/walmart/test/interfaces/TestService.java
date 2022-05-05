package com.walmart.test.interfaces;

import com.walmart.test.dto.TestRequestDTO;
import org.springframework.http.ResponseEntity;

public interface TestService {

    ResponseEntity<?> store(TestRequestDTO testRequestDTO);
}
