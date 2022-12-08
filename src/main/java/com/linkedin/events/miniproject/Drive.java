package com.linkedin.events.miniproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Drive {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

//        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        person.getVehicle().getVehicleService().move();
        person.getVehicle().getVehicleService().playMusic();

    }
}
