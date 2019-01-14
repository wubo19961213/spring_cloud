package com.wubo.fegin;

import com.wubo.fallback.OrderFeginFallBack;
import com.wubo.service.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "app-member", fallback = OrderFeginFallBack.class)
public interface OrderFegin extends IMemberService {
}
