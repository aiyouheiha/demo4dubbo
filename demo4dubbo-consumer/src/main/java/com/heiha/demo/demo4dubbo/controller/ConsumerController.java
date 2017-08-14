package com.heiha.demo.demo4dubbo.controller;

import com.heiha.demo.demo4dubbo.service.NoticeService;
import com.heiha.demo.demo4dubbo.service.TransferService;
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
@ImportResource(locations = "classpath*:/demo-all-dubbo.xml")
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private NoticeService noticeService;

    @Autowired
    private TransferService transferService;

    @RequestMapping(value = "/notice/hello", method = RequestMethod.GET)
    public String sayHello() {
        return noticeService.sayHello();
    }

    @RequestMapping(value = "/transfer/toChar", method = RequestMethod.GET)
    public char toChar(int integer) {
        return (char)integer;
    }
}
