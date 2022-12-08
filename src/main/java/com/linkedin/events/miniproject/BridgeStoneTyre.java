package com.linkedin.events.miniproject;


import org.springframework.stereotype.Service;


public class BridgeStoneTyre implements TyreService{
    @Override
    public void rotate() {
        System.out.println("Moving the car with BridgeStone Tyre.........");
    }
}
