package com.zhou.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhouyao on 2018/4/9.
 */
@RestController
public class ProduceController
{
    @Resource
    private DiscoveryClient client;

    @RequestMapping("/get")
    public String get() {
        ServiceInstance instance = client.getLocalServiceInstance();

        return "当前eureka提供者端口号port:" + instance.getPort();
    }

}
