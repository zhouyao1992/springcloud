package com.zhou.service;

/**
 * Created by zhouyao on 2018/4/12.
 */
public class BaseService
{

    /**
     * Hystrix 熔断机制异常处理
     * @return
     */
    public String HystrixFallback() {
        return "服务器异常error";
    }



}
