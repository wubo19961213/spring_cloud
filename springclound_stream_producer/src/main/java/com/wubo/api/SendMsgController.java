package com.wubo.api;

import com.wubo.stream.SendMessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2019-01-11 19:57
 **/
@RestController
public class SendMsgController {
    @Autowired
    private SendMessageInterface sendMessageInterface;

    @RequestMapping("/sendMsg")
    public String sendMsg() {
        String msg = UUID.randomUUID().toString();
        System.out.println("生产者发送消息" + msg);
        Message build = MessageBuilder.withPayload(msg.getBytes()).build();
        sendMessageInterface.sendMsg().send(build);
        return "success";
    }
}
