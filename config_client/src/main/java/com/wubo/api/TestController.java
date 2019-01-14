package com.wubo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2018-12-24 15:31
 **/
@RestController
@RefreshScope
public class TestController {
    @Value("${wubo}")
    private String wubo;

    @RequestMapping("/getWubo")
    public String getWubo() {
        return wubo;
    }
}
