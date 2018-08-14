package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
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
    @Autowired
    private Queue queue;

    @RequestMapping("/sendTopic")
    public String sendTopic(){
        jmsTemplate.convertAndSend(this.topic,"发送到activeMQ上的topic数据!");
        return "发送topic模式成功!";
    }

    @RequestMapping("/sendQueue")
    public String sendQueue(){
        jmsTemplate.convertAndSend(this.queue,"发送到activeMQ上的queue数据!");
        return "发送queue模式成功!";
    }
}
