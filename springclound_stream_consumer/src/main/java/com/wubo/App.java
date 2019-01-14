package com.wubo;

import com.wubo.stream.RedMessageInterface;
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
@EnableBinding(value = {RedMessageInterface.class})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
