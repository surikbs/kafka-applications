package com.surikbs.kafka.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class kafkaConfig {
    final static Logger LOG = LoggerFactory.getLogger(kafkaConfig.class);

    @Value(value = "${stage}")
    private String kafkastage;

    public Map<String, Object> kafkaProperties(){
        Map<String, Object> props = new HashMap<>();
        props.put("stage", kafkastage);
        System.out.println("test");
        return props;
    }
}
