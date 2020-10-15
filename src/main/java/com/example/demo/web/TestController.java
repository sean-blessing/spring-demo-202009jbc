package com.example.demo.web;

import org.springframework.web.bind.annotation.*;

import com.example.demo.business.Pumpkin;

@RestController
@RequestMapping("/tests")
public class TestController {
	
	@GetMapping("/")
	public String testing() {
		return "Testing 1,2,3!";
	}

	@GetMapping("/pumpkin")
	public Pumpkin makePumpkin() {
		Pumpkin p = new Pumpkin(1,"orange",11.5, 12, 15, true);
		return p;
	}
}
