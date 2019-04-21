package com.github.zk.springcloudribbon.controller;

import com.github.zk.springcloudribbon.service.IRibbon;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping("/hi")
    public String hiController(@RequestParam String name) {
        return iRibbon.hiService(name);
    }
}
