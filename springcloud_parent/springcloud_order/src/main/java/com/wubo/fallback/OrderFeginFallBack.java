package com.wubo.fallback;

import com.wubo.base.BaseApiService;
import com.wubo.base.ResponseBase;
import com.wubo.entity.User;
import com.wubo.fegin.OrderFegin;
import org.springframework.stereotype.Component;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2018-12-24 16:48
 **/
@Component
public class OrderFeginFallBack extends BaseApiService implements OrderFegin {
    @Override
    public User getMember(String name) {
        return null;
    }

    @Override
    public ResponseBase getUserInfo() {
        return setResultError("服务降级");
    }
}
