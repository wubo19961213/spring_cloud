package com.wubo;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2018-12-17 11:41
 **/
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
@EnableSwagger2Doc
public class SpringCloundOrder {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloundOrder.class, args);
    }
}
