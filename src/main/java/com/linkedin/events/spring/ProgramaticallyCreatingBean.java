package com.linkedin.events.spring;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;
import java.util.Random;
import java.util.function.Supplier;

public class ProgramaticallyCreatingBean {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var audi = new Vehicle();
        audi.setName("AUDI25");
        Supplier<Vehicle> supplierOfAudi = () -> audi;

        Supplier<Vehicle> supplierOfBenz = () -> {
            var benz = new Vehicle();
            benz.setName("BENZ25");
            return benz;
        };

        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println("Random Number = " + num);

        if(num%2!= 0){
                context.registerBean("audi", Vehicle.class, supplierOfAudi);
        }else{
            context.registerBean("benz", Vehicle.class, supplierOfBenz);
        }

        Vehicle audiVehicle = null;
        Vehicle benzVehicle = null;

        try{
            audiVehicle= context.getBean("audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException ex){
            System.out.println("An error occurred while creating bean");
        }

        try{
            benzVehicle = context.getBean("benz", Vehicle.class);
        }catch (NoSuchBeanDefinitionException ex){
            System.out.println("An error occurred while creating bean");
        }

        if(Objects.nonNull(audiVehicle)){
            System.out.println("Vehicle name from context is : " + audiVehicle.getName());
        }

        if(Objects.nonNull(benzVehicle)){
            System.out.println("Vehicle name from context is : " + benzVehicle.getName());
        }


    }



}
