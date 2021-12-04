package com.surikbs.kafka.service;

import com.surikbs.kafka.config.kafkaConfig;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class configService {

    kafkaConfig kafkaConfig;

    public configService(com.surikbs.kafka.config.kafkaConfig kafkaConfig) {
        this.kafkaConfig = kafkaConfig;
    }

    public Map<String, Object> getProperties() {
        return kafkaConfig.kafkaProperties();
    }
}
