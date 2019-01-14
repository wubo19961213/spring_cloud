package com.wubo.api;

import com.wubo.base.BaseApiService;
import com.wubo.base.ResponseBase;
import com.wubo.entity.User;
import com.wubo.service.IMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_cloud
 * @description:
 * @author: WuBo
 * @create: 2018-12-17 11:01
 **/
@RestController
@Slf4j
@Api("member接口文档")
public class MemberApiServiceImpl extends BaseApiService implements IMemberService {

    @Value("${server.port}")
    private String port;

    @ApiOperation("getMember接口")
    @ApiImplicitParam(name = "getMember",required = true,type = "String",value = "获取会员信息")
    @RequestMapping("/getMember")
    public User getMember(@RequestParam("name") String name) {
        User user = new User();
        user.setAge("23");
        user.setName(name);
        user.setPort(port);
        return user;
    }

    @ApiOperation("getUserInfo接口")
    @RequestMapping("/getUserInfo")
    public ResponseBase getUserInfo() {
        log.info("调用会员服务成功！");
        return setResultSuccess("订单服务调用会员服务.." + port);
    }
}
