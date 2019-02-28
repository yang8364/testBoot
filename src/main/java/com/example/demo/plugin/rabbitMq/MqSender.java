package com.example.demo.plugin.rabbitMq;

import com.example.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class MqSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    Logger log = LoggerFactory.getLogger(this.getClass());

    public void send() {
        User user = new User();
        user.setId("1");
        user.setUserName("ych");
        user.setPassWord("pass");
        log.info("mqSend start user is : " +  user);
        this.rabbitTemplate.convertAndSend("exchange","hello", user.toString());

    }

}
