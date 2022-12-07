package com.linkedin.events.spring;

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


    public void hello(){
        System.out.println("Saying hello from Vehicle class." + this.getName());
    }
}