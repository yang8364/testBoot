package com.example.demo.plugin.rabbitMq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
//
@Component
@RabbitListener(queues = "hello")
public class MqReceiverA {

    private static Logger log = LoggerFactory.getLogger(MqReceiverA.class);
    @RabbitHandler
    public void  process(String hello){
        log.info("receiverA is " + hello);
    }
}
