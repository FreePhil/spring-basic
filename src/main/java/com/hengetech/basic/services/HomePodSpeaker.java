package com.hengetech.basic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("development")
public class HomePodSpeaker implements Speaker {

    @Override
    public String echo() {
        return "Apple say Hello";
    }
    
}
