package com.wubo.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface RedMessageInterface {
    //创建一个输出管道，用于发送消息
    @Input("my_msg")
    SubscribableChannel redMsg();
}
