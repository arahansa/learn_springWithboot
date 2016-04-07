package com.example.learn.web.interceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorTestController {
	
	@RequestMapping("/test/interceptor")
	public String interceptor(){
		return "hello world";
	}

}
