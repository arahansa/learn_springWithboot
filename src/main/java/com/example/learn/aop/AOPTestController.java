package com.example.learn.aop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AOPTestController {
	
	@PreAuth
	@RequestMapping("/test/aop")
	public String testAop(){
		System.out.println("테스트 2 ");
		return "test";
	}

}
