package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/holaMundo")
	public String saludo() {
		return "Hola mundo";
	}
	
}
