package com.lin.part02_builder;

import org.springframework.stereotype.Component;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/8 19:09
 */
@Component
public class ContrateBuilder extends AbstractBuilder{
    @Override
    public void buildUsername(String username) {
        userInfo.setUsername(username);
    }

    @Override
    public void buildGentle(String gentle) {
        userInfo.setGentle(gentle);
    }

    @Override
    public void buildAge(int age) {
        userInfo.setAge(age);
    }

    @Override
    public UserInfo getUserInfo() {
        return super.getUserInfo();
    }
}
