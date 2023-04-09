package com.lin;

import com.lin.part01_factorymethod.TVFactory;
import com.lin.part02_builder.Director;
import com.lin.part02_builder.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Test02DesignModeApplicationTests {

    @Autowired
    private Director director;

    @Autowired
    @Qualifier("haierTVFactory")
    private TVFactory factory;


    @Resource(name = "haierTVFactory")
    private TVFactory resource;

    @Test
    void contextLoads() {
        factory.productTV();
        System.out.println("-------------");
        resource.productTV();
    }

    @Test
    void testBuilder(){
        UserInfo userInfo = director.constract("小明", "男", 12);
        System.out.println(userInfo);
    }
}
