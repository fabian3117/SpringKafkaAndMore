package com.example.demo.kafka.producter;

import com.example.demo.dto.BodyMail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaProducterSender {
    @Autowired
    private KafkaTemplate<String, BodyMail> kafkaTemplate;

    public void send(String topic, String message) {
        log.info("Sending : {}", message);
        log.info("--------------------------------");

        BodyMail body=BodyMail.builder()
                .texto("HOLA")
                .asunto("KAFKA")
                .destino("fabian3117@frba.utn.edu.ar")
                .build();
        kafkaTemplate.send(topic,body);
    }
}
