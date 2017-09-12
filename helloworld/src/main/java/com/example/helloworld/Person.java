package com.example.helloworld;

import java.util.List;

public class Person {

    private String name;
    private int age;

    private List<String> hands;

    public Person(String name, int age, List<String> hands){
        this.name = name;
        this.age = age;
        this.hands = hands;
    }

    public Person() {

    }

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

    public List<String> getHands() {
        return hands;
    }

    public void setHands(List<String> hands) {
        this.hands = hands;
    }

}
