package com.zjw;

import com.zjw.provider.pojo.User;
import com.zjw.provider.service.CalcService;
import com.zjw.provider.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by zhoum on 2017/3/30.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:dubbo/dubboconsumer.xml");
        UserService userService = (UserService) app.getBean("userService");
        List<User> userList = userService.queryAll();
        System.out.println("userList.size()--------------------------------------"+userList.size());
        for (User user : userList) {
            System.out.println(user);
        }
        CalcService calcService = (CalcService) app.getBean("calcService");
        Integer result = calcService.add(4, 4);
        System.out.println("result--------------------------------------"+result);
    }
}
