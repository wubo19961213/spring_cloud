package com.wubo.consumer;

import com.wubo.stream.RedMessageInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2019-01-11 20:57
 **/
@Component
public class Consumer {
    @Autowired
    private RedMessageInterface redMessageInterface;

    @StreamListener(value = "my_msg")
    public void redMsg(String msg) {
        System.out.println("消费者接收消息" + msg);
    }
}
