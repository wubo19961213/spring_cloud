package com.wubo.api;

import com.wubo.base.BaseApiService;
import com.wubo.base.ResponseBase;
import com.wubo.entity.User;
import com.wubo.fegin.OrderFegin;
import com.wubo.service.IOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2018-12-17 11:42
 **/
@RestController
@Api("控制器")
public class OrderApiServiceImpl extends BaseApiService implements IOrderService {

    @Autowired
    private OrderFegin fegin;

    @ApiOperation("getOrder接口")
    @ApiImplicitParam(name = "name", value = "获取订单", type = "String", required = true)
    @PostMapping("/getOrder")
    public ResponseBase getOrder(@RequestParam("name") String name) {
        User user = fegin.getMember(name);
        ResponseBase responseBase = new ResponseBase();
        responseBase.setMsg(user == null ? "sorry" : user.toString());
        System.out.println(responseBase);
        return responseBase;
    }

    @ApiOperation("getOrderInfo接口")
    @GetMapping("/getOrderInfo")
    public ResponseBase getOrderInfo() {
        System.out.println("getOrderInfo:" + "当前线程池名称:" + Thread.currentThread().getName());
        return fegin.getUserInfo();
    }


    @GetMapping("/orderToMemberUserInfoHystrix")
    public ResponseBase orderToMemberUserInfoHystrix() {
        System.out.println("orderToMemberUserInfoHystrix:" + "线程池名称:" + Thread.currentThread().getName());
        return fegin.getUserInfo();
    }

}
