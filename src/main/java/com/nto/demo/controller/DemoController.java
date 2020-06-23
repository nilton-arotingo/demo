package com.nto.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/demo")
@RestController
public class DemoController {
	
	@GetMapping(value="/home", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String home() {
		
		log.info("this is a simple demo");
		return "This is a simple demo";
	}

}
