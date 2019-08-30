package com.qf.cloud.provider.service;

import com.qf.cloud.provider.api.TradeService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TradeServiceImpl implements TradeService {

    @Override
    public String initWithGiveMoney(Long userId, Double money) {
        //初始化钱包
        //充值100元
        System.out.println("初始化钱包，充值100元。userId:" + userId + " money:" + money);
        return "success";
    }


    @Override
    public String SayHello(String hello) {

        return "hello";
    }
}
