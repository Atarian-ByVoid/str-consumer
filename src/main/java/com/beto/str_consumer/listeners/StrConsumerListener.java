package com.beto.str_consumer.listeners;

import org.springframework.stereotype.Component;

import com.beto.str_consumer.custom.StrConsumerCustomListener;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {
    
    @StrConsumerCustomListener(groupdId = "group-1")
    public void listener(String message){
        log.info("CRIADO ::: Mensagem Recebida {}", message);
    }

    @StrConsumerCustomListener(groupdId = "group-2")
    public void log(String message){
        log.info("LOG ::: Mensagem Recebida {}", message);
    }


}
