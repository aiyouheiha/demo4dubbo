package com.heiha.demo.demo4dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.heiha.demo.demo4dubbo.service.TransferService;

/**
 * <br>
 * <b>Project:</b> demo4dubbo<br>
 * <b>Date:</b> 2017/8/14 16:58<br>
 * <b>Author:</b> heiha<br>
 */
@Service
public class TransferServiceImpl implements TransferService {
    @Override
    public char toChar(int i) {
        return 0;
    }
}
