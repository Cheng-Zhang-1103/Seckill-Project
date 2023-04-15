package com.example.seckilldemo.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Message Sender
 *
 * @author: boshen
 * @ClassName: MQSender
 */
@Service
@Slf4j
public class MQSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    /**
     * Send seckill message
     * @author boshen
     * @operation add
     * @date 6:44 下午 2022/3/8
     * @param message
     * @return void
     **/
    public void sendSeckillMessage(String message) {
        log.info("Send a message" + message);
        rabbitTemplate.convertAndSend("seckillExchange", "seckill.message", message);
    }


//    public void send(Object msg) {
//        log.info("Send a message" + msg);
////        rabbitTemplate.convertAndSend("queue", msg);
//        rabbitTemplate.convertAndSend("fanoutExchange", "", msg);
//    }
//
//
//    public void send01(Object msg) {
//        log.info("Send red" + msg);
//        rabbitTemplate.convertAndSend("directExchange", "queue.red", msg);
//    }
//
//    public void send02(Object msg) {
//        log.info("Send red" + msg);
//        rabbitTemplate.convertAndSend("directExchange", "queue.green", msg);
//    }
//
//
//    public void send03(Object msg) {
//        log.info("Send message (received by QUEUE01): " + msg);
//        rabbitTemplate.convertAndSend("topicExchange", "queue.red.message", msg);
//    }
//
//
//    public void send04(Object msg) {
//        log.info("Send message (QUEUE02 receive): " + msg);
//        rabbitTemplate.convertAndSend("topicExchange", "green.queue.green.message", msg);
//    }
//
//
//    public void send05(String msg) {
//        log.info("Sending messages (received by QUEUE01 and QUEUE02): " + msg);
//        MessageProperties properties = new MessageProperties();
//        properties.setHeader("color", "red");
//        properties.setHeader("speed", "fast");
//        Message message = new Message(msg.getBytes(), properties);
//        rabbitTemplate.convertAndSend("headersExchange", "", message);
//    }
//
//    public void send06(String msg) {
//        log.info("Send message (received by QUEUE01): " + msg);
//        MessageProperties properties = new MessageProperties();
//        properties.setHeader("color", "red");
//        properties.setHeader("speed", "normal");
//        Message message = new Message(msg.getBytes(), properties);
//        rabbitTemplate.convertAndSend("headersExchange", "", message);
//    }


}
