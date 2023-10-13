package com.hengetech.basic.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hengetech.basic.models.Identity;
import com.hengetech.basic.models.QuotationEntity;
import com.hengetech.basic.repos.QuotationRepo;
import com.hengetech.basic.services.Speaker;

@RestController
public class ApiController {
   private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    private final Speaker speaker;
    private final QuotationRepo quotationRepo;

    @Autowired
    public ApiController(Speaker speaker, QuotationRepo quotationRepo) {
        this.speaker = speaker;
        this.quotationRepo = quotationRepo;
    }
    
    @GetMapping("/api/hello")
    public String hello() {
        return speaker.echo();
    }

    @PostMapping("/api/hello")
    public Identity postIdentity(@RequestBody Identity id) {
        logger.info(id.toString());

        var quotation = quotationRepo.findById(id.name());
        quotation.ifPresentOrElse(
            q -> logger.info(q.toString()),
            () -> logger.error("no value"));

        var q = quotation.orElseGet(() -> new QuotationEntity());
        logger.info(q.toString());
        return id;
    }
}
