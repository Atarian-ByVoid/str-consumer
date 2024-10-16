package com.beto.str_consumer.exception;

import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ErrorCustomException  implements KafkaListenerErrorHandler{

    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
        log.info("EXCEPTION ::: HANDLER");
        log.info("Headers ::: {}",message.getHeaders());
        log.info("Payload ::: {}",message.getPayload());
        log.info("Offset ::: {}",message.getHeaders().get("kafka_offset"));

       return null;
    }
    
}
