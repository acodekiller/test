package com.lin;

import com.lin.part01_factorymethod.TVFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Test02DesignModeApplicationTests {

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

}
