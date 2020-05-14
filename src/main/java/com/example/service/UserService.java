package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csdn.ingo.dao.UserInfoMapper;
import com.csdn.ingo.entity.UserInfo;

@Service //声明成一个spring bean
public class UserService {

    @Autowired //连接到UserDao Bean
    private UserInfoMapper userInfoMapper;

    public String show() {	
        return "Hello World!";
    }

    public UserInfo showDao(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    public String insert(String name, int age) { //插入一条记录
    	UserInfo user = new UserInfo();
        user.setName(name);
        user.setAge(age);
        userInfoMapper.insert(user);
        return "Insert ( \""+name+"\", age"+age+") OK!";
    }
}