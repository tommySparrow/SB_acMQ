package com.example.demo.server;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/8/10
 * @ Description：
 * @ throws
 */

@Component
public class ActiveMqServer {

    @JmsListener(destination = "topic")//监听
    public void receiveTopic(String message) {
        System.out.println("监听topic=============NO.1");
        System.out.println("打印:"+message);
    }

    @JmsListener(destination = "queue")
    public void receiveQueue(String message) {
        System.out.println("监听queue=============监听queue");
        System.out.println(message);

    }
}
