package com.qf.cloud.consumer.controller;

import com.qf.cloud.provider.api.TradeService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zhouhaifeng zhouhaifeng
 *  zhouhaifeng zhouhaifeng
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private TradeService tradeService;

    @GetMapping("/test")
    public String register() {
        Long userId = 1L;
        Double money = Double.valueOf("100");
        //RPC调用交易服务
        tradeService.initWithGiveMoney(userId, money);

        return "注册成功";
    }

    @GetMapping("/hello")
    public String Sayhello(String hello) {

        String h = tradeService.SayHello( hello );

        return h;
    }


}
