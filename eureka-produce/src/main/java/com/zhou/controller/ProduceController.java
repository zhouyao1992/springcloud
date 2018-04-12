package com.zhou.controller;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * eureka服务提供者
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

    @RequestMapping("/getParam")
    public String getParam(String name) {
        ServiceInstance instance = client.getLocalServiceInstance();

        return "当前eureka提供者端口号port:" + instance.getPort()+"===========feign调用eureka请求参数为"+name;
    }











}
