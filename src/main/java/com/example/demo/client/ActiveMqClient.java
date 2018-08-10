package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Topic;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/8/10
 * @ Description：
 * @ throws
 */
@RestController
public class ActiveMqClient {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Topic topic;

    @RequestMapping("/sendTopic")
    public void send(){
        jmsTemplate.convertAndSend(this.topic,"发送到activeMQ上的topic数据!");
    }
}
