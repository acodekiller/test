package com.lin.part02_builder;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/8 19:07
 */
public class UserInfo {

    private String username;

    private String gentle;

    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGentle() {
        return gentle;
    }

    public void setGentle(String gentle) {
        this.gentle = gentle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", gentle='" + gentle + '\'' +
                ", age=" + age +
                '}';
    }
}
