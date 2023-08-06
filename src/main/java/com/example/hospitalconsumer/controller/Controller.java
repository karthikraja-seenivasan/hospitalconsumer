package com.example.hospitalconsumer.controller;

import com.example.hospitalconsumer.dto.PatientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get")
    public ResponseEntity<PatientDto> get(){


        PatientDto forObject = restTemplate.getForObject("http://localhost:8081/get/1", PatientDto.class);

        return ResponseEntity.ok(forObject);
    }
}
