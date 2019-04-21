package com.github.zk.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zk
 * @Date 2019/4/20 23:17
 */
@RestController
public class EurekaClientController {
    @Value("${server.port}")
    private int port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi," + name + " i`m from " + port;
    }
}
