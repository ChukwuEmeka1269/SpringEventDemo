package com.linkedin.events.miniproject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SonySpeaker implements SpeakersService{
    @Override
    public void makeSound() {
        System.out.println("Making sound from Sony Speaker........@#$%%");
    }
}
