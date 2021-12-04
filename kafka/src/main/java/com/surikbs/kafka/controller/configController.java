package com.surikbs.kafka.controller;

import com.surikbs.kafka.service.configService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class configController {
    com.surikbs.kafka.service.configService configser;

    public configController(configService configser) {
        this.configser = configser;
    }

    @GetMapping(value = "/properties")
    public ResponseEntity<String> getProperties(){
        ResponseEntity<String> ResponseEntity;
        return new ResponseEntity(configser.getProperties(),HttpStatus.OK);
    }

}
