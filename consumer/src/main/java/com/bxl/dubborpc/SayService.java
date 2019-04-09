package com.bxl.dubborpc;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bxl.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by root on 2019/4/9.
 */

@Component
public class SayService {

    //@Reference   //使用自动扫描包的方式
    @Autowired   //使用xml的时候需要使用Autowired
    SayHello sayHello;

    public String say (String name) {

        return sayHello.sayHello(name);
    }
}
