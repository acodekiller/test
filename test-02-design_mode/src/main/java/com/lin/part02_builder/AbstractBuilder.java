package com.lin.part02_builder;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/8 19:08
 */
public abstract class AbstractBuilder {

    protected UserInfo userInfo = new UserInfo();

    public abstract void buildUsername(String username);

    public abstract void buildGentle(String gentle);

    public abstract void buildAge(int age);

    public UserInfo getUserInfo(){
        return userInfo;
    }

}
