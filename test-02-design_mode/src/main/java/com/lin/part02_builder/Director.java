package com.lin.part02_builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/8 19:12
 */
@Service
public class Director {

    @Autowired
    private AbstractBuilder builder;

    public UserInfo constract(String username,String gentle,int age){
        builder.buildUsername(username);
        builder.buildGentle(gentle);
        builder.buildAge(age);
        return builder.getUserInfo();
    }

}
