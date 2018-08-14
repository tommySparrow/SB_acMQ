package com.example.demo.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/8/10
 * @ Description：
 * @ throws
 */

@Configuration
public class ActiveMqTopicConfig {
    @Bean
    public Topic topic(){
        return new ActiveMQTopic("topic");
    }
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("queue");
    }
}
