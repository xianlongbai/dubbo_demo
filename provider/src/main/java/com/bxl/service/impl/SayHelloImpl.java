package com.bxl.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bxl.service.SayHello;

/**
 * Created by root on 2019/4/9.
 */
@Service   //如果使用xml配置,则不需要加注解
public class SayHelloImpl implements SayHello {

    @Override
    public String sayHello(String name){
        return "Hello " + name + "!";
    }
}
