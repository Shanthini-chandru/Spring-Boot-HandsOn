package com.spring_boot.practice_spring_boot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigController {

    @Autowired
    private CurrencyServiceConfiguration config;

    @RequestMapping("/currency-config")
    public CurrencyServiceConfiguration retrieveAllCourse() {
        return config;
    }
}
//http://localhost:8080/courses
// Course: id, name, auth