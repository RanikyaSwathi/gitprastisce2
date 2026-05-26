package com.gitpractisce12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public void get() {
		System.out.println("hello");
	}
}
