package com.linkedin.events.spring;


import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import java.util.function.Supplier;


@Configuration
@ComponentScan(basePackages = "com.linkedin.events.spring")
public class ProjectConfig {


    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println("Person in the context is : "+ person.getName());
        System.out.println("Person's vehicle is : " + person.getVehicle());
    }

    @Bean()
    public Vehicle vehicle1(){
        System.out.println("Vehicle1 is being created in the context");
        Vehicle audi = new Vehicle();
        audi.setName("Audi");
        return audi;
    }
    @Bean
    @Primary
    public Vehicle vehicle2(){
        System.out.println("Vehicle2 is being created in the context");
        Vehicle honda = new Vehicle();
        honda.setName("Honda");
        return honda;
    }
    @Bean
    public Vehicle vehicle3(){
        System.out.println("Vehicle3 is being created in the context");
        Vehicle toyota = new Vehicle();
        toyota.setName("Toyota");
        return toyota;
    }


}
