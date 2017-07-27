package com.heiha.demo.demo4dubbo.service;

import com.heiha.demo.demo4dubbo.pojo.Notice;

import java.util.List;

/**
 * <br>
 * <b>Project:</b> demo4dubbo<br>
 * <b>Date:</b> 2017/7/27 10:10<br>
 * <b>Author:</b> heiha<br>
 */
public interface NoticeService {
    String sayHello();
    Notice getNotice();
    List<Notice> listNotice();
}
