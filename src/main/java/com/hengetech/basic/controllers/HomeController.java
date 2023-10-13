package com.hengetech.basic.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hengetech.basic.models.Identity;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class HomeController {
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/hello")
    public String getHello(Model model, @RequestParam(value="name", required=false) String name) {
        name = Optional.ofNullable(name).orElse("World");
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/hello")
    public ResponseEntity<?> postIdentity(@RequestBody Identity id) {
        logger.info(id.toString());
        return ResponseEntity.ok(id);
    }
    
}
