package com.my.escape.Controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("/api/hello")
	public String hello() {
		
		return "안녕하세요~"+ new Date() +"입니다.";
	}
}
