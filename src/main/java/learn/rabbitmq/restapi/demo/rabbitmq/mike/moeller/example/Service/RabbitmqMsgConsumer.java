package learn.rabbitmq.restapi.demo.rabbitmq.mike.moeller.example.config;

import org.springframework.stereotype.Service;

@Service
public class RabbitmqMsgConsumer {
    public void stdOutput(String msg) {
        System.out.println("new message received" + msg);
    }

    
}