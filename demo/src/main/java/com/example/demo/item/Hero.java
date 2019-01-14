package com.example.demo.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2019-01-12 16:28
 **/
@Component
public class Hero {

    public Hero(){
        System.out.println("已初始化");
    }
}
