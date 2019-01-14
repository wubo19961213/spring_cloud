package com.wubo;

import com.wubo.stream.SendMessageInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2019-01-11 20:02
 **/
@SpringBootApplication
@EnableBinding(value = {SendMessageInterface.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
