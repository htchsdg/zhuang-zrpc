package com.zhuang.examplespringbootprovider;

import com.zhuang.example.common.model.User;
import com.zhuang.example.common.service.UserService;
import com.zhuang.zrpc.springboot.starter.annotation.RpcService;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 */
@Service
@RpcService
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
