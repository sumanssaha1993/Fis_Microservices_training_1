package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
@RequestMapping("/firstDemo")
public class DemoController {

	@Autowired
	private MyService myservice;
	
	@GetMapping("/greetings")
	public String getGreetings() {
		return myservice.getGreetings();
	}
	
	@GetMapping("/helloWorld")
	public String getGreetings1() {
		return "Hello world!!";
	}
	
}
