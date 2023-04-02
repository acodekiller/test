package com.lin.part01_factorymethod;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/2 17:57
 */
@Component
public class HaierTVFactory implements TVFactory{
    @Override
    public TV productTV() {
        System.out.println("海尔工厂生产海尔电视。");
        return new HaierTV();
    }
}
