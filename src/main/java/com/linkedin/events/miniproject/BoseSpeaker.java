package com.linkedin.events.miniproject;

import org.springframework.stereotype.Service;

@Service
public class BoseSpeaker implements SpeakersService{
    @Override
    public void makeSound() {
        System.out.println("Making Sound from Bose Speaker.....@@#$%^^");
    }
}
