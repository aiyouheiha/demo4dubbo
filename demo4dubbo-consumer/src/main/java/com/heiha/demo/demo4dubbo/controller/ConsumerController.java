package com.heiha.demo.demo4dubbo.controller;

import com.heiha.demo.demo4dubbo.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * <b>Project:</b> demo4dubbo<br>
 * <b>Date:</b> 2017/7/27 14:24<br>
 * <b>Author:</b> heiha<br>
 */
@ImportResource(locations = "classpath*:/demo-notice-dubbo.xml")
@RestController
@RequestMapping("/notice")
public class ConsumerController {
    @Autowired
    private NoticeService noticeService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return noticeService.sayHello();
    }
}
