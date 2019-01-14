package com.wubo.service;

import com.wubo.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IOrderService {
    @RequestMapping("/getOrder")
    ResponseBase getOrder(@RequestBody String name);

    @RequestMapping("/getOrderInfo")
    ResponseBase getOrderInfo();

    @RequestMapping("/orderToMemberUserInfoHystrix")
    ResponseBase orderToMemberUserInfoHystrix();
}
