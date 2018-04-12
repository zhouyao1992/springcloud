package com.zhou.service;

import org.springframework.stereotype.Component;

/** Hystrix 降级处理机制
 * Created by zhouyao on 2018/4/12.
 */
@Component
public class FeignConsumerServiceFallback  implements   FeignConsumerService
{


    /**
     * feign无参调用
     * eureka-produce提供方服务
     * @return
     */

    public String get(){



     return  "feign无参调用异常：未发现eureka-produce服务提供者";
    }


    /**
     * feign 有参调用
     * eureka-produce提供方服务
     * @param name
     * @return
     */

    public String getParam(String name){


        return  "feign有参调用异常：未发现eureka-produce服务提供者";

    }
}
