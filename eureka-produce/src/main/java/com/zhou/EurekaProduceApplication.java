package com.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient//服务提供者，并注册到Eureka服务中心
@SpringBootApplication
public class EurekaProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProduceApplication.class, args);
	}
}
