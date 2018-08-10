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
public class ActiveMqServer2 {

    @JmsListener(destination = "topic")//监听
    public void receiveTopic(String message) {
        System.out.println("监听topic=============NO.2");
        System.out.println("打印:"+message);
    }
}
