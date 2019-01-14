package com.wubo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2019-01-11 15:08
 **/
@RestController
public class OrderController {
    @Value("${port:9090}")
    private String port;

    @RequestMapping("/getPort")
    public String getPort() {
        return port;
    }
}
