package com.test;

import org.springframework.stereotype.Service;

/**
 * <p>描述: 实现接口
 * <p>版权: 税友软件集团股份有限公司
 * <p>日期: 2019/3/21 11:27
 * <p>作者: hha
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello provider:" + name;
    }
}
