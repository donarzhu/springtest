package com.spring.test;

/**
 * Created by donar on 2016/11/2.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 4.3.3 : Hello ! " + name);
    }

}
