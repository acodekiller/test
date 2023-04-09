package com.lin.part04_sigleton;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/9 18:24
 */
public class Singleton {



    private final static String str = "STR";

    private Singleton(){

    }

    public static String getStr() {
        return str;
    }


}
