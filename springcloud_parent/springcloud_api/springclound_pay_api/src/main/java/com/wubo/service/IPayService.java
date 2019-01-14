package com.wubo.service;

import com.wubo.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IPayService {

    @RequestMapping("/getPay")
    ResponseBase getPay();
}
