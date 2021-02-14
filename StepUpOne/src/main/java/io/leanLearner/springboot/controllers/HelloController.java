package io.leanLearner.springboot.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.leanLearner.springboot.pojos.Greet;

@RestController
public class HelloController {
	@RequestMapping("/")
    public Greet getGreet() {
    	return new Greet("Hello LeanLearner");
    }
}  
