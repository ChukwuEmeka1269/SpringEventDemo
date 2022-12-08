package com.linkedin.events.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

//    @PostConstruct
//    public void init(){
//        this.name = "audi33";
//    }

    @Override
    public String toString() {
        return name;
    }

    public void hello(){
        System.out.println("Saying hello from Vehicle class." + this.getName());
    }
}
