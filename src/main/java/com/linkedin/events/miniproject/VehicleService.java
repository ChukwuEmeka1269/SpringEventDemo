package com.linkedin.events.miniproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class VehicleService {

   private final TyreService tyreService;
   private final SpeakersService speakersService;

    public VehicleService(@Qualifier("michellinTyre")TyreService tyreService,
                          SpeakersService speakersService) {
        this.tyreService = tyreService;
        this.speakersService = speakersService;
    }


    public void playMusic(){
       speakersService.makeSound();
   }

   public void move(){
       tyreService.rotate();
   }


}
