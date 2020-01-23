package com.alithya.eurekaClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface  GreetingFeignClient {
    @RequestMapping("/greeting")
    String greeting();
}
