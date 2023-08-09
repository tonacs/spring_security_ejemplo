package com.tona.app_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/cards")
public class CardsController {
    @GetMapping
    public Map<String,String> cards(){

        //...bussiness logic
        return Collections.singletonMap("msj","cards");
    }
}
