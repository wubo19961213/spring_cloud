package com.wubo.api;

import com.wubo.base.BaseApiService;
import com.wubo.base.ResponseBase;
import com.wubo.fegin.PayFegin;
import com.wubo.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2018-12-26 15:11
 **/
@RestController
public class PayApiServiceImpl extends BaseApiService implements IPayService {

    @Autowired
    PayFegin payFegin;

    @RequestMapping("/getPay")
    public ResponseBase getPay() {
        ResponseBase orderInfo = payFegin.getOrderInfo();
        return setResultSuccess("getPay+" + orderInfo);
    }
}
