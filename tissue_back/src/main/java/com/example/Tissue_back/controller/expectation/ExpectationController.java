package com.example.Tissue_back.controller.expectation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/expectation")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class ExpectationController {
}
