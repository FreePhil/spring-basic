package com.hengetech.basic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("production")
public class AirPodSpeaker implements Speaker {

    @Override
    public String echo() {
        return "AirPod says Hello";
    }
    
}
