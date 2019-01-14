package com.wubo.fegin;

import com.wubo.service.IOrderService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "app-order")
public interface PayFegin extends IOrderService {
}
