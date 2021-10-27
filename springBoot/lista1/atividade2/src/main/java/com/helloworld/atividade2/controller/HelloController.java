package com.helloworld.atividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloController {
	@GetMapping
	public String hello2() {
		return "Objetivo de aprendizagem: Aprender a utilizar o Spring Boot.";
	}

}
