package com.test;

import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * <p>描述: 加载Spring配置，启动服务
 * <p>版权: 税友软件集团股份有限公司
 * <p>日期: 2019/3/21 14:49
 * <p>作者: hha
 */
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-provider.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            System.in.read();   //按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
