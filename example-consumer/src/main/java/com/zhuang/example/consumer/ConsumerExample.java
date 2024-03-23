package com.zhuang.example.consumer;

import com.zhuang.example.common.model.User;
import com.zhuang.example.common.service.UserService;
import com.zhuang.zrpc.bootstrap.ConsumerBootstrap;
import com.zhuang.zrpc.proxy.ServiceProxyFactory;

/**
 * 服务消费者示例
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 服务提供者初始化
        ConsumerBootstrap.init();

        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("zhuang");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
