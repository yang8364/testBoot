package com.example.demo.plugin.rabbitMq;

import com.example.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@RabbitListener (queues = "hello")
public class MqReceiver {
    private static Logger log = LoggerFactory.getLogger(MqReceiver.class);
    @RabbitHandler
    public void  process(String user){
        log.info("receiver is " + user);
    }
}
