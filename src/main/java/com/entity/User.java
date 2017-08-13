package com.entity;

import org.springframework.stereotype.Component;

/**
 * Created by latham on 17-8-13.
 */
@Component
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void add(int a,int b){
        int c = a+b;
        System.out.println("User add() a+b =" + c);
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
