package com.heiha.demo.demo4dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.heiha.demo.demo4dubbo.pojo.Notice;
import com.heiha.demo.demo4dubbo.service.NoticeService;

import java.util.List;

/**
 * <br>
 * <b>Project:</b> demo4dubbo<br>
 * <b>Date:</b> 2017/7/27 10:19<br>
 * <b>Author:</b> heiha<br>
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Override
    public String sayHello() {
        return "Hello ~";
    }

    @Override
    public Notice getNotice() {
        return null;
    }

    @Override
    public List<Notice> listNotice() {
        return null;
    }
}
