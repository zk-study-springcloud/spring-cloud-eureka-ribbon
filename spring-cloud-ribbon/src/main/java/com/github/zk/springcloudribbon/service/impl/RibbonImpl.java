package com.github.zk.springcloudribbon.service.impl;

import com.github.zk.springcloudribbon.service.IRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zk
 * @Date 2019/4/21 11:11
 */
@Service
public class RibbonImpl implements IRibbon {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name , String.class);
    }
}
