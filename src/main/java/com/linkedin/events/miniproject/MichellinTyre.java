package com.linkedin.events.miniproject;

import org.springframework.stereotype.Service;


public class MichellinTyre implements TyreService{
    @Override
    public void rotate() {
        System.out.println("Moving the car with Michellin Tyre.........");
    }
}
