package com.bxl.service.impl;

import com.bxl.service.DubboService;

/**
 * Created by root on 2018/9/15.
 */

public class DubboServiceImpl implements DubboService {

    @Override
    public String sayHello(String name) {
        System.out.println("接受到客户端消息："+name);
        return "你好,客户端！！！";
    }

}
