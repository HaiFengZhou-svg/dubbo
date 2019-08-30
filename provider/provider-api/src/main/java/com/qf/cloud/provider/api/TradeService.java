package com.qf.cloud.provider.api;

/**
 * 交易服务RPC 接口
 */
public interface TradeService {

    /**
     * 初始化用户钱包，给钱包加指定金额
     *
     * @param userId 用户ID
     * @param money  指定金额
     * @return success:成功 failed:失败
     */
    String initWithGiveMoney(Long userId, Double money);


    String SayHello(String hello);

}
