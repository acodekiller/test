package com.lin.part01_factorymethod;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/2 17:55
 */
public class HaierTV implements TV{


    @Override
    public void play() {
        System.out.println("海尔电视播放电视中……");
    }
}
