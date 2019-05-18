package com.github.zk.springcloudribbon.controller;

import com.github.zk.springcloudribbon.service.IRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zk
 * @Date 2019/4/21 11:08
 */
@RestController
public class RibbonController {
    @Autowired
    private IRibbon iRibbon;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @RequestMapping("/hi")
    public String hiController(@RequestParam String name) {
        return iRibbon.hiService(name);
    }
    @RequestMapping("/testRibbon")
    public String testController() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        return serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }
}
