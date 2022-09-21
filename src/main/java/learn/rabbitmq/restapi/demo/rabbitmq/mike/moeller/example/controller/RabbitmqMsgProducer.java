package learn.rabbitmq.restapi.demo.rabbitmq.mike.moeller.example.congroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import learn.rabbitmq.restapi.demo.rabbitmq.mike.moeller.example.config.RabbitmqConfig;

// @RestController, a component
@RestController
public class RabbitmqMsgProducer {
    // RabbitTemplate Class, org.springframework.amqp.rabbit.core
    private final RabbitTemplate _rabbitTemplate;
    // Constructor Injection
    public RabbitmqMsgProducer(RabbitTemplate template) {
        _rabbitTemplate = template;
    }
    //POST message resource, <msg>: string
    @PostMapping("/msg")
    public String postMessage(@RequestParam String msg) {
        // convertAndSedn : (<FinalInstance> : RabbitTemplate -> <TopicExchangeInstance> : String -> <TopicName> : String -> <StringToSend>: String) 
        _rabbitTemplate.convertAndSend(RabbitmqConfig._topicExchange,
            "mike.rabbitmqExample", msg);
        return "New Message Sent: " + msg; 
    }
} 