# Spring framework basics
The source code contains the application of packages e.g. [web.bind.annotation](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/package-summary.html), [amqp.rabbit.core](https://docs.spring.io/spring-amqp/api/org/springframework/amqp/rabbit/core/package-summary.html), [springdoc](https://springdoc.org/) and [slf4j.Logger](https://www.slf4j.org/api/org/slf4j/Logger.html).

# Goal
The goal is to run a spring boot applicaiton to enable api for sending message through a rabbitmq server. The received message should be logged by the application as well.

* Rabbitmq AMQP settings
The settings include assigning values to the objects such as Queue, TopicExchange, Binding, SimpleMessageListenerContainer and MessageListenerAdapter. 

* Producing messages

* Logging received messages.

# Result
The message can be produced by using Swagger UI through localhost:8080/swagger-ui/index.html and the correspoding messages should be observed in the console.

# P.S.
All credits from the demo should belong to [Mike Møller Nielsen](https://www.youtube.com/watch?v=WzO6_4jeliM)