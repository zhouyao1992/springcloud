package com.zhou.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 定义eureka提供者调用接口
 * 通过@FeignClient注解指定提供者服务名来绑定服务
 * name:绑定服务名称
 * fallback:Hystrix 降级处理机制
 * Created by zhouyao on 2018/4/12.
 */
@FeignClient(name = "eureka-produce",fallback = FeignConsumerServiceFallback.class)
public interface FeignConsumerService
{

    /**
     * feign无参调用
     * eureka-produce提供方服务
     * @return
     */
    @RequestMapping("/get")
    String get();


    /**
     * feign 有参调用
     * eureka-produce提供方服务
     * @param name
     * @return
     */
    @RequestMapping("/getParam")
    String getParam(@RequestParam("name") String name);
}
