package com.wubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2018-12-26 15:09
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloundPay {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloundPay.class, args);
    }
}
