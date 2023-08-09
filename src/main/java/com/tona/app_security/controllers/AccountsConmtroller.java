package com.tona.app_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/accounts")
public class AccountsConmtroller {
    @GetMapping
    public Map<String,String> accounts(){

        //...bussiness logic
        return Collections.singletonMap("msj","accounts");
    }
}
